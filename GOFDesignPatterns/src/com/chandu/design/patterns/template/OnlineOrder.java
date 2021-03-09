package com.chandu.design.patterns.template;

//ConcreteClass(OnlineOrder) implementing all the operations required by the 
//templateMethod that were defined as abstract in the parent(OrderTemplate) class.
public class OnlineOrder extends OrderTemplate {

	
	
	@Override
	public void selectproduct() {
		System.out.println("Adding the Product to the cart with Shipping Details");

	}

	@Override
	public void paymentprocess() {
		System.out.println("Online Payment Processed");

	}

	@Override
	public void deliverytype() {
		System.out.println("Order has been Shipped as per the Delivery Address added");

	}

}
