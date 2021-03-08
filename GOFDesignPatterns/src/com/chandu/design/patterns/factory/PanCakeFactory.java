package com.chandu.design.patterns.factory;

public class PanCakeFactory {

	public static PanCake createPanCake(String type) {
		PanCake p = null;
		if (type.equals("strawberry")) {
			p = new StrawberryPanCake();
		}
		if (type.equals("chocolate")) {
			p = new ChocolatePanCake();
		}
		if (type.equals("regular")) {
			p = new RegularPanCake();
		}
		return p;
	}

}
