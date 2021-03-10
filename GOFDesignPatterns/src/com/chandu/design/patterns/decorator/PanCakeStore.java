package com.chandu.design.patterns.decorator;

public class PanCakeStore {

	public static void main(String[] args) {
		PanCake pancake = new ChocolatePanCakeDecorator(new StrawberryPanCakeDecorator(new RegularPanCake()));
		pancake.make();

	}

}
