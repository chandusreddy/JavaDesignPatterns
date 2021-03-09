package com.chandu.design.patterns.adapter;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public int pay(int dollars) {

		return dollars;
	}

}
