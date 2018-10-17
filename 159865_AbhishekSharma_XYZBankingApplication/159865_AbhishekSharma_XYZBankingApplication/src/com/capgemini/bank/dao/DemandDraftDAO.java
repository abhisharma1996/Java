package com.capgemini.bank.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capgemini.bank.bean.DemandDraft;
import com.capgemini.bank.util.ConnectionProvider;


public class DemandDraftDAO implements IDemandDraftDAO{
	 private Connection conn=ConnectionProvider.getDBConnection();
	@Override
	public int addDemandDraftDetails(DemandDraft demandDraft) throws SQLException{
		try {
			conn.setAutoCommit(false);
			PreparedStatement ps1=conn.prepareStatement("Insert into demand_draft values(Transaction_Id_Seq.nextval,?,?,?,?,?,?,?)");
			ps1.setString(1, demandDraft.getCustomer_name());
			ps1.setString(2, demandDraft.getIn_favor_of());
			ps1.setString(3, demandDraft.getPhone_number());
			ps1.setString(4, demandDraft.getDate_of_transaction());
			ps1.setInt(5, demandDraft.getDd_amount());
			ps1.setInt(6, demandDraft.getDd_commission());
			ps1.setString(7, demandDraft.getDd_description());
			ps1.executeUpdate();
			conn.commit();
			PreparedStatement ps2 = conn.prepareStatement("select max(transaction_id) from demand_draft");
			ResultSet r = ps2.executeQuery();
			r.next();
			int transaction_id = r.getInt(1);
			return transaction_id;
	} catch (SQLException e) {
			   conn.rollback();
			   throw e;
		}
			finally{
				conn.setAutoCommit(true);
			}
		
		
	}

	@Override
	public DemandDraft getDemandDraftDetails(int transactionId) throws SQLException {
			PreparedStatement ps4=conn.prepareStatement("Select * from demand_draft where transaction_id="+transactionId);
			ResultSet demandRS = ps4.executeQuery();
			if(demandRS.next()) {
				
				String customer_name=demandRS.getString("customer_name");
				String in_favor_of=demandRS.getString("in_favor_of");
				String phone_number=demandRS.getString("phone_number");
				String date_of_transaction=demandRS.getString("date_of_transaction");
				int dd_amount=demandRS.getInt("dd_amount");
				int dd_commission=demandRS.getInt("dd_commission");
				String dd_description=demandRS.getString("dd_description");
				DemandDraft dd=new DemandDraft(transactionId, dd_amount, customer_name, in_favor_of, date_of_transaction, dd_description, phone_number);
		        return dd;
				} 
				else
					return null;
	}

}
