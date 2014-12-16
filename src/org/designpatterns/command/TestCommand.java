package org.designpatterns.command;

public class TestCommand {

	public static void main(String[] args) {
		
		RemoteController remote = new RemoteController();
		
		Light livingRoomLight = new Light("Living Room");
		Light garageLight = new Light("Garage");
		GarageDoor garageDoor = new GarageDoor();
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		LightOnCommand garageLightOn = new LightOnCommand(garageLight);
		LightOffCommand garageLightOff = new LightOffCommand(garageLight);
		
		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
		
		remote.setCommands(0, livingRoomLightOn, livingRoomLightOff);
		remote.setCommands(1, garageLightOn, garageLightOff);
		remote.setCommands(2, garageDoorUp, garageDoorDown);
		
		System.out.println(remote);
		
		for(int i = 0; i < 4; i++) {
			remote.onButtonPushed(i);
			remote.offButtonPushed(i);
		}

	}

}
