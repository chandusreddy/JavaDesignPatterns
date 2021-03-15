package com.chandu.design.patterns.facade;

public class FacadeTest {

	public static void main(String[] args) {
		
		// Problem is the Client needs to create the instance and implement all the methods instead
		// facade pattern will take of this.

//		ShippingProcess shipping = new ShippingProcess();
//
//		if (shipping.checkLabel("SonyTV")) {
//			String trackingId = shipping.shipProduct("SonyTV", 2);
//			shipping.deliverProduct(trackingId);
//
//		}
		// Using Facade pattern, the client code looks simple.
		
		ShippingFacade facade = new ShippingFacade();
		facade.shippingProduct("Sony TV", 2);

	}

}
