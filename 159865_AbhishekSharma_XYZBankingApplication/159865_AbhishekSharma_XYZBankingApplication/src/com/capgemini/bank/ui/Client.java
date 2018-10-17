package com.capgemini.bank.ui;

import java.util.Scanner;

import com.capgemini.bank.bean.DemandDraft;
import com.capgemini.bank.exceptions.BankingServicesDownException;
import com.capgemini.bank.service.DemandDraftService;

public class Client {

	public static void main(String[] args) {
		String name,phoneno,infavorof;
		int ddamount;
		String remarks;

		System.out.println("1)Enter Demand Draft Details");
		System.out.println("2)Exit");
		Scanner s=new Scanner(System.in);
		int sel=s.nextInt();
		switch(sel){
		case 1:
			System.out.println("Enter the name of the customer:");
			name=s.next();
			System.out.println("Enter customer phone number:");
			phoneno=s.next();
			System.out.println("In favor of:");
			infavorof=s.next();
			System.out.println("Enter Demand Draft amount (in Rs):");
			ddamount=s.nextInt();
			System.out.println("Enter Remarks:");
			remarks=s.next();
			DemandDraft dd=new DemandDraft(ddamount, name, infavorof, remarks, phoneno);
			DemandDraftService dds=new DemandDraftService();
			try {
				System.out.println("Your Demand Draft request has been successfully registered along with the "+dds.addDemandDraftDetails(dd));
			} catch (BankingServicesDownException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 2:
			break;
		default:
			break;

		}

	}

}
