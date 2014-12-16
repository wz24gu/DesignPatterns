package org.designpatterns.command;

public class RemoteController {
	
	Command[] onCommands;
	Command[] offCommands;
	
	public RemoteController() {
		
		onCommands = new Command[4];
		offCommands = new Command[4];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < 4; i ++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
		
	public void setCommands(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonPushed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonPushed(int slot) {
		offCommands[slot].execute();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("---------- Remote Controller ----------\n");
		for (int i = 0; i < onCommands.length; i++) {
			sb.append("[slot " + i + "]: " + onCommands[i].getClass().getName() + " | ");
			sb.append(offCommands[i].getClass().getName() + "\n");
		}
		
		return sb.toString();
	}

}
