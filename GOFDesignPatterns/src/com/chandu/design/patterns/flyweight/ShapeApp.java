package com.chandu.design.patterns.flyweight;

public class ShapeApp {

	public void render(int numberofShapes) {

		// This will create lot of objects in the memory that will be a problem if there
		// are large no of objects.
//		Shape[] shapes = new Shape[numberofShapes + 1];
//		for (int i = 1; i <= numberofShapes; i++) {
//			if (i % 2 == 0) {
//				shapes[i] = new Circle();
//				((Circle) shapes[i]).setRadius(i);
//				((Circle) shapes[i]).setLineColor("red");
//				((Circle) shapes[i]).setFillColor("white");
//				shapes[i].draw();
//
//			} else {
//				shapes[i] = new Rectangle();
//				((Rectangle) shapes[i]).setLength(i);
//				((Rectangle) shapes[i]).setBreadth(i + i);
//				((Rectangle) shapes[i]).setFillStyle("dotted");
//				shapes[i].draw();
//			}
//		}
//	}

		// This is most efficient way of creating the objects using flyweight pattern
		// The total objects that were created were just two objects.
		Shape shape = null;
		for (int i = 1; i <= numberofShapes; i++) {
			if (i % 2 == 0) {
				shape = ShapeFactory.getShape("Circle");
				shape.draw(i, "red", "white");
			} else {
				shape = ShapeFactory.getShape("Rectangle");
				shape.draw(i, i + i, "dotted");
			}
		}

	}
}
