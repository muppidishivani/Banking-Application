package com.web.model;

public class BankTransactions {
private double transferamount;
private long targetaccountno;
public BankTransactions() {
	super();
}
public BankTransactions(double transferamount, long targetaccountno) {
	super();
	this.transferamount = transferamount;
	this.targetaccountno = targetaccountno;
}
public double getTransferamount() {
	return transferamount;
}
public void setTransferamount(double transferamount) {
	this.transferamount = transferamount;
}
public long getTargetaccountno() {
	return targetaccountno;
}
public void setTargetaccountno(long targetaccountno) {
	this.targetaccountno = targetaccountno;
}
@Override
public String toString() {
	return "BankTransactions [transferamount=" + transferamount + ", targetaccountno=" + targetaccountno + "]";
}

}
