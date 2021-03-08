package com.chandu.design.patterns.factory;

public class PanCakeStore {

	public PanCake orderPanCake(String type) {
		// Replacing the below object creation by the Factory Pattern method as below
		PanCake p = PanCakeFactory.createPanCake(type);

//		if (type.equals("chocolate")) {
//			p = new ChocolatePanCake();
//		}
//		if (type.equals("strawberry")) {
//			p = new StrawberryPanCake();
//		}
//		if (type.equals("regular")) {
//			p = new RegularPanCake();
//		}

		p.mix();
		p.prepare();
		p.decorate();

		return p;
	}

}
