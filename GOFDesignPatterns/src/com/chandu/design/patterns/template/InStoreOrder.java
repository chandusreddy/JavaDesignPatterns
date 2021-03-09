package com.chandu.design.patterns.template;

//ConcreteClass(InStoreOrder) implementing all the operations required by the 
//templateMethod that were defined as abstract in the parent(OrderTemplate) class.
public class InStoreOrder extends OrderTemplate {

	@Override
	public void selectproduct() {
		System.out.println("Getting the product from the shelf at the store");

	}

	@Override
	public void paymentprocess() {
		System.out.println("Payment Process at the checkout counter");

	}

	@Override
	public void deliverytype() {
		System.out.println("Item has been handed over to the customer directly at the store");

	}

}
