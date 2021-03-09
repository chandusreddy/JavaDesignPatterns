package com.chandu.design.patterns.command;

// This is reciever in the Command Design Pattern
public class Person {

	public static void main(String[] args) {

		Xbox xbox = new Xbox();

		RemoteControlDevice remotecontrol = new RemoteControlDevice();
		OnCommand oncommand = new OnCommand(xbox);
		// we can change command dynamically 
		remotecontrol.setCommand(oncommand);
		remotecontrol.pressButton();

		OffCommand offcommand = new OffCommand(xbox);
		remotecontrol.setCommand(offcommand);
		remotecontrol.pressButton();
	}

}
