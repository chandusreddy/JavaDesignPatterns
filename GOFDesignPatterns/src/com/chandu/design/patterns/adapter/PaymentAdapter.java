package com.chandu.design.patterns.adapter;

//Adapter class that takes care of converting the amount of Rupees into Dollars
public class PaymentAdapter {

	public int paymentconverter(int rupees) {

		int dollars = rupees / 65;

		return dollars;

	}

}
