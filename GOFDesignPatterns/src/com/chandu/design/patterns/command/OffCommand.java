package com.chandu.design.patterns.command;

//This is concrete command in the Command Design Pattern
public class OffCommand implements Command {

	Xbox xbox;

	// The constructor is passed with xbox it is going to control. 
	public OffCommand(Xbox xbox) {
		this.xbox = xbox;
	}

	@Override
	public void execute() {
		xbox.off();

	}

}
