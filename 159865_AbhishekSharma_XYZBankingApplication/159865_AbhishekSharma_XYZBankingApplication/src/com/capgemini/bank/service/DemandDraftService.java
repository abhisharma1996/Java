package com.capgemini.bank.service;

import java.sql.SQLException;

import com.capgemini.bank.bean.DemandDraft;
import com.capgemini.bank.dao.DemandDraftDAO;
import com.capgemini.bank.dao.IDemandDraftDAO;
import com.capgemini.bank.exceptions.BankingServicesDownException;
import com.capgemini.bank.exceptions.InvalidTransactionIdException;

public class DemandDraftService implements IDemandDraftService{
	IDemandDraftDAO de=new DemandDraftDAO(); 
	@Override
	public int addDemandDraftDetails(DemandDraft demandDraft)throws BankingServicesDownException {
		try {
			return de.addDemandDraftDetails(demandDraft);
		} catch (SQLException e) {
			throw new BankingServicesDownException("Banking Services Are Down");
		}
		
	}

	@Override
	public DemandDraft getDemandDraftDetails(int transactionId) throws BankingServicesDownException,InvalidTransactionIdException{
		try {
			if(de.getDemandDraftDetails(transactionId)==null)throw new InvalidTransactionIdException("Enter the correct TransactionId");
			else
				return de.getDemandDraftDetails(transactionId);
		} catch (SQLException e) {
			throw new BankingServicesDownException("Banking Services Are Down");
		}

	}

}
