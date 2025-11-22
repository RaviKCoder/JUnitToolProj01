package com.ravi.upi;

public class UPIPayment {
	
	public String doUPIPayment(long mNumber,double amount) {
		return amount+" amount is transfered to your mobile "+mNumber+" by phonePay";
	}
	
	public String doUPIPaymentByAccno(long accno,double amount) {
		return amount+" amount is transfered to your accno "+accno+" by phonePay";
	}
}
