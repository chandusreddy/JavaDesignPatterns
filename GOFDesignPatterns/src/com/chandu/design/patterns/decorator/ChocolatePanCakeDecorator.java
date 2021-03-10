package com.chandu.design.patterns.decorator;

public class ChocolatePanCakeDecorator extends PanCakeDecorator {

	public ChocolatePanCakeDecorator(PanCake pancake) {
		super(pancake);
	}
	
	public void make() {
		super.make();
		System.out.println("Adding the Cholocate flavor to PanCake");
	}

}
