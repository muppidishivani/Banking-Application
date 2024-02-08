package com.web.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.web.model.Bank;
import com.web.model.BankTransactions;
import com.web.repository.BankRepo;
@Service
public class BankServiceImp implements BankService {
@Autowired
private BankRepo repo;

@Override
public Bank saveBank(Bank bank) {
	
	return repo.save(bank);
}
	@Override
	public Bank getBank(long accountNo) {
		Bank getone=repo.findById(accountNo).get();
		return getone;
	}
	@Override
	public Bank getrecord(long accountNo, Bank bank) {
	
		 Bank b=repo.findById(accountNo).get();
		 double c=b.getAmount();
		 double d=c-bank.getWithdrawAmount();
		 bank.setAmount(d);
		
		 return repo.save(bank);
		}
	@Override
	public Bank getWithdraw(long accountNo, Bank bank) {
		 Bank d=repo.findById(accountNo).get();
		 double e=d.getAmount();
		 double g=e+bank.getDeposit();
		 bank.setAmount(g);
		
		 return repo.save(bank);
		
	}

	@Override
	public Bank getClass(Bank bank, BankTransactions banktransaction) {
		Optional<Bank> amount=repo.findById(bank.getAccountNo());
		Bank a1=amount.get();
		a1.setAmount(a1.getAmount()-banktransaction.getTransferamount());
		repo.save(a1);
		Optional<Bank> amount1=repo.findById(banktransaction.getTargetaccountno());
		Bank a2=amount1.get();
		a2.setAmount(a2.getAmount()+banktransaction.getTransferamount());
		
		return repo.save(a2);
	}
	@Override
	public Bank getamount(Bank bank,long accountNo) {
		Bank b=repo.findById(accountNo).get();
		 int d=b.getStatus();
		 String status;
		 if(d==1)
		 {
			status="Account Is Active"; 
		 }
		 else
		 {
			 status="Account is Inactive ";
		 }
		
		return repo.save(bank);
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

