package com.chandu.design.patterns.decorator;

public class PanCakeDecorator implements PanCake {

	PanCake pancake;

	public PanCakeDecorator(PanCake pancake) {
		this.pancake = pancake;
	}

	@Override
	public void make() {
		pancake.make();

	}

}
