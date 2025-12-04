package com.ravi.main;

import com.ravi.card.Card;
import com.ravi.cash.Cash;
import com.ravi.nb.NetBanking;
import com.ravi.service.ArithmeticOperation;
import com.ravi.upi.UPIPayment;


//Main added
public class Main {
	public static void main(String[] args) {
	ArithmeticOperation ao=new ArithmeticOperation();
	
	System.out.println("Result: "+ao.add(10, 20));
	System.out.println("Result: "+ao.sub(20, 10));
	
	System.out.println("========================");
	
	UPIPayment upiPayment=new UPIPayment();
	System.out.println(upiPayment.doUPIPayment(9471718299L, 5000.0));
	System.out.println(upiPayment.doUPIPaymentByAccno(123456789L, 10000.0));

	System.out.println("=========================");
	
	NetBanking nb=new NetBanking();
	String result=nb.transferMoney(123456789L, 987456123L, 20000.0,"RTGS");
	System.out.println(result);
	
	
	System.out.println("================================");
	
	Card card=new Card();
	String paymentByCard = card.paymentByCard();
	System.out.println(paymentByCard);
	
	System.out.println("=================================");
	
	Cash cash=new Cash();
	String payment = cash.payment();
	System.out.println(payment);
	
	
	}
}
