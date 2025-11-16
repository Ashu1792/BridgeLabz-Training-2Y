package com.OnlineOrderProcessing;

public class OnlineOderSystem {
	
	static void placeOrder (int choice) throws OutofStockException, PaymentFailException;
	{
		switch(choice) {
		case 1:
			throw new OutofStockException("Out of Stock");
		case 2:
			throw new PaymentFailException("Your payment got failed");
			
		case 3:
			System.out.println("order placed successfully");
			break;
		default:
			System.out.println("invalid choice.Please enter 1,2,3");
		}
	}

}
