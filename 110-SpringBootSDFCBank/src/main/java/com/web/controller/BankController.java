package com.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.Bank;
import com.web.model.BankTransactions;
import com.web.service.BankServiceImp;


@Controller
public class BankController {
	@Autowired
	private  BankServiceImp service;
@RequestMapping("/")
public String homePage()
{
	return "home";
}
@RequestMapping("/addbank")
public String registerPage()
{
	return "account";
	
}
@RequestMapping("register")
public String save(Bank bank,ModelMap model)
{
	Bank b=service.saveBank(bank);
	return "success";
	
}
@RequestMapping("/viewbank")
public String getForm()
{
	return "balance";
}
@RequestMapping("/login")
public String getBalance(Bank bank,long accountNo ,ModelMap model)
{
	model.put("bank", service.getBank(accountNo));

	return "record";
	
}
@RequestMapping("/form2")
public String recordForm()
{
	return "form1";
}


@RequestMapping("/view")
public String getdeposit(Bank bank,ModelMap model,long accountNo)
{
	model.put("bank", service.getrecord(accountNo, bank));
	System.err.println(bank);
	return "form3";
	
}
@RequestMapping("/with")
public String withDraw()
{
	
	return "withdraw";
	
}
@RequestMapping("/contact")
public String getwithdraw(Bank bank,ModelMap model,long accountNo)
{
	model.put("bank", service.getWithdraw(accountNo, bank));
	System.err.println(bank);
	return "amount";
	
}
@RequestMapping("/transfer")
public String transfer()
{
	return "transferamount";
}
@RequestMapping("/trans")
public String transferForm(Bank bank,ModelMap model,BankTransactions banktransaction)
{
	model.put("bank", service.getClass(bank, banktransaction));
	return "transferaccount";
	
}
@RequestMapping("/amount")
public String account()
{
	return "closea/c";
}
@RequestMapping("/close")
public String accountClose(Bank bank,long accountNo,ModelMap model)
{
	model.put("bank", service.getamount(bank, accountNo));
	return "close";
	
}
}



