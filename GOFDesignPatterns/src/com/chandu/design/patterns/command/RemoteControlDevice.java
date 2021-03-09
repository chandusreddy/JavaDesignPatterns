package com.chandu.design.patterns.command;

//A Simple remote control device with one button 
//This is Invoker in the Command Design Pattern
public class RemoteControlDevice {

	private Command command;

	public void pressButton() {
		command.execute();
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		 // set the command the remote will execute
		this.command = command;
	}

}
