package com.capgemini.bank.service;

import com.capgemini.bank.bean.DemandDraft;
import com.capgemini.bank.exceptions.BankingServicesDownException;
import com.capgemini.bank.exceptions.InvalidTransactionIdException;

public interface IDemandDraftService {
	int addDemandDraftDetails(DemandDraft demandDraft) throws BankingServicesDownException;
	DemandDraft getDemandDraftDetails(int transactionId) throws BankingServicesDownException, InvalidTransactionIdException;
}
