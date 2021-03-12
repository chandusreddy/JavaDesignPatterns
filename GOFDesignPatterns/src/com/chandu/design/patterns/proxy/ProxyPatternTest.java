package com.chandu.design.patterns.proxy;

public class ProxyPatternTest {

	public static void main(String[] args) {

//		Student student = new StudentImpl();
		// Using the proxy Pattern Implementation
		Student student = new StudentProxyImpl();
		System.out.println(student.getId());
		System.out.println(student.getGrades().size());

	}
}
