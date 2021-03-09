package com.chandu.design.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

//Class used to get a Shape using HashMap (Returns 
//an existing Shape if a Shape of given type exists. 
//Else creates a new Shape and returns it. 
public class ShapeFactory {
	
	
	 /* HashMap stores the reference to the object 
    of Circle or Rectangle Shapes.  */
	private static Map<String, Shape> shapes = new HashMap<>();

	public static Shape getShape(String type) {
		Shape shape = null;
		 /* If an object for Circle or Rectangle has already been 
        created simply return its reference */
		if (shapes.get(type) != null) {
			shape = shapes.get(type);
		} else {
			if (type.equals("Circle")) {
				shape = new Circle();
			} else if (type.equals("Rectangle")) {
				shape = new Rectangle();

			}
			// Once created insert it into the HashMap 
			shapes.put(type, shape);
		}

		return shape;

	}

}
