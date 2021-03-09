package com.chandu.design.patterns.template;

//AbstractClass contains the Orderprocess() template method 
//which should be made final so that it cannot be overridden.

public abstract class OrderTemplate {

	// template method
	public final void Orderprocess() {
		selectproduct();
		paymentprocess();
		deliverytype();

	}

	// Abstract methods that will be used by the child classes
	public abstract void selectproduct();

	public abstract void paymentprocess();

	public abstract void deliverytype();

}
