package com.chandu.design.patterns.factory;

public class ChocolatePanCake implements PanCake {

	@Override
	public void mix() {	
		System.out.println("Mixing Chocolate PanCake ");
	}

	@Override
	public void prepare() {
		System.out.println("Preparing Chocolate PanCake");
	}

	@Override
	public void decorate() {
		System.out.println("Decorating Chocolate PanCake");
	}

}
