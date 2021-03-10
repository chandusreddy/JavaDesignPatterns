package com.chandu.design.patterns.decorator;

public class StrawberryPanCakeDecorator extends PanCakeDecorator{

	public StrawberryPanCakeDecorator(PanCake pancake) {
		super(pancake);
	}
	public void make() {
		super.make();
		System.out.println("Adding the Strawberry flavor to PanCake");
	}
}
