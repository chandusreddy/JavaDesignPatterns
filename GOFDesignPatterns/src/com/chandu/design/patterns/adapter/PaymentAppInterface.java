package com.chandu.design.patterns.adapter;

public class PaymentAppInterface {

	public int pay(int rupees) {

		// The type we are getting in the method is int rupees but the find method
		// in the implementation class accept the dollars as the input, thus we need to
		// create an Adapter class that takes rupees and returns the dollars
		// PaymentProcessor p = new PaymentProcessorImpl();
		// p.pay(500);
		PaymentAdapter pa = new PaymentAdapter();
		int dollars = pa.paymentconverter(rupees);
		return dollars;

	}

	public static void main(String[] args) {
		PaymentAppInterface pi = new PaymentAppInterface();
		int pay = pi.pay(500);
		System.out.println("The enterted Equivalent Dollar amount paid: " + pay + "$");

	}

}
