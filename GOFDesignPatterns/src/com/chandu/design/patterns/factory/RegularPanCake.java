package com.chandu.design.patterns.factory;

public class RegularPanCake implements PanCake {

	@Override
	public void mix() {
		System.out.println("Mixing Regular PanCake");
	}

	@Override
	public void prepare() {
		System.out.println("Preparing Regular PanCake");
	}

	@Override
	public void decorate() {
		System.out.println("Decorating Regular PanCake");
	}

}
