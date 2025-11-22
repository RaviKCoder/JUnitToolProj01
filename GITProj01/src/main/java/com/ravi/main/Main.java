package com.ravi.main;

import com.ravi.nb.NetBanking;
import com.ravi.service.ArithmeticOperation;
import com.ravi.upi.UPIPayment;

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
	String result=nb.transferMoney(123456789L, 987456123L, 20000.0);
	System.out.println(result);
	
	}
}
