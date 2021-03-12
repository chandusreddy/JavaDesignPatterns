package com.chandu.design.patterns.prototype;

public class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Sachin");
		student1.setGrade(new Grade());
		// Using clone method default method implementation - Shallow Copy
		Student student2 = student1.clone();
		System.out.println(student1);
		System.out.println(student2);

		Student student3 = new Student(student1);
		System.out.println(student3);

	}

}
