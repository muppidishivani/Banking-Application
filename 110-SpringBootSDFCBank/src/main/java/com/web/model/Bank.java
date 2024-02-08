package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	private long accountNo;
	private String name;
	private String psw;
	private String cpsw;
	private double amount;
	private String address;
	private long mobileNo;
	private double deposit;
	private double withdrawAmount;
	private long targetAccountNum;
	private double transferAmount;
	private int status;
	
	public Bank() {
		super();
	}

	public Bank(long accountNo, String name, String psw, String cpsw, double amount, String address, long mobileNo,
			double deposit, double withdrawAmount, long targetAccountNum, double transferAmount, int status) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.psw = psw;
		this.cpsw = cpsw;
		this.amount = amount;
		this.address = address;
		this.mobileNo = mobileNo;
		this.deposit = deposit;
		this.withdrawAmount = withdrawAmount;
		this.targetAccountNum = targetAccountNum;
		this.transferAmount = transferAmount;
		this.status = status;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getCpsw() {
		return cpsw;
	}

	public void setCpsw(String cpsw) {
		this.cpsw = cpsw;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public long getTargetAccountNum() {
		return targetAccountNum;
	}

	public void setTargetAccountNum(long targetAccountNum) {
		this.targetAccountNum = targetAccountNum;
	}

	public double getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bank [accountNo=" + accountNo + ", name=" + name + ", psw=" + psw + ", cpsw=" + cpsw + ", amount="
				+ amount + ", address=" + address + ", mobileNo=" + mobileNo + ", deposit=" + deposit
				+ ", withdrawAmount=" + withdrawAmount + ", targetAccountNum=" + targetAccountNum + ", transferAmount="
				+ transferAmount + ", status=" + status + "]";
	}

	
}