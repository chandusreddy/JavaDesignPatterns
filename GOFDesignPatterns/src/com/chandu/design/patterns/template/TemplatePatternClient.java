package com.chandu.design.patterns.template;

public class TemplatePatternClient {

	public static void main(String[] args) {
		// Calling the online Order implementation class
		OrderTemplate oo = new OnlineOrder();
		oo.Orderprocess();
		System.out.println();
		System.out.println("------------- ******************** --------------");
		System.out.println();
		// Calling the InStore Order implementation class
		OrderTemplate io = new InStoreOrder();
		io.Orderprocess();

	}

}
