package com.web.service;


import com.web.model.Bank;
import com.web.model.BankTransactions;

public interface BankService {
public Bank saveBank(Bank bank);
public Bank getBank(long accountNo);
public Bank getrecord(long accountNo,Bank bank);
public Bank getWithdraw(long accountNo, Bank bank);
public Bank getClass(Bank bank,BankTransactions banktransaction);
public Bank getamount(Bank bank,long accountNo);

}
