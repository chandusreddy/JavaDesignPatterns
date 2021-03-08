package com.chandu.design.patterns.factory;

public class StrawberryPanCake implements PanCake {

	@Override
	public void mix() {
		System.out.println("Mixing Strawberry PanCake");
	}

	@Override
	public void prepare() {
		System.out.println("Preparing Strawberry PanCake");
	}

	@Override
	public void decorate() {
		System.out.println("Decorating Strawberry PanCake");
	}

}
