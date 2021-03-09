package com.chandu.design.patterns.flyweight;

public class Circle extends Shape {

	private String label;

//	private String fillColor;
//	private String lineColor;
//	private int radius;
//
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
//
//	public String getFillColor() {
//		return fillColor;
//	}
//
//	public void setFillColor(String fillColor) {
//		this.fillColor = fillColor;
//	}
//
//	public String getLineColor() {
//		return lineColor;
//	}
//
//	public void setLineColor(String lineColor) {
//		this.lineColor = lineColor;
//	}
//
//	public int getRadius() {
//		return radius;
//	}
//
//	public void setRadius(int radius) {
//		this.radius = radius;
//	}

	public Circle() {
		label = "Circle";
	}

	@Override
	public void draw(int radius, String fillColor, String lineColor) {

		System.out.println("Drawing a " + label + " with radius " + radius + " Fill Color " + fillColor + " Line Color "
				+ lineColor);

	}

}
