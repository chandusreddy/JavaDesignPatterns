package com.chandu.design.patterns.command;

//Xbox class and its corresponding command methods to ON and OFF
//This is client in the Command Design Pattern
public class Xbox {
	
	public void on() {
		System.out.println("Xbox is switched ON");
	}
	
	public void off() {
		System.out.println("Xbox is switched OFF");
	}

}
