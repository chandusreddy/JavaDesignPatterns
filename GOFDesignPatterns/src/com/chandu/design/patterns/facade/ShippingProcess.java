package com.chandu.design.patterns.facade;

public class ShippingProcess {

	public boolean checkLabel(String name) {
		System.out.println("Check if the label is created.");
		return true;
	}

	public String shipProduct(String name, int quantity) {
		System.out.println("Shipping the product.");
		return "xye68SKVBj";
	}

	public void deliverProduct(String trackingId) {
		System.out.println("The Product has been delivered.");

	}

}
