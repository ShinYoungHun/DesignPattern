package Chapter6.remotecontrol;

import Chapter6.remotecontrol.commands.CeilingFanOffCommand;
import Chapter6.remotecontrol.commands.CeilingFanOnCommand;
import Chapter6.remotecontrol.commands.GarageDoorCloseCommand;
import Chapter6.remotecontrol.commands.GarageDoorOpenCommand;
import Chapter6.remotecontrol.commands.LightOffCommand;
import Chapter6.remotecontrol.commands.LightOnCommand;
import Chapter6.remotecontrol.commands.StereoOffCommand;
import Chapter6.remotecontrol.commands.StereoOnWithCDCommand;
import Chapter6.remotecontrol.device.CeilingFan;
import Chapter6.remotecontrol.device.GarageDoor;
import Chapter6.remotecontrol.device.Light;
import Chapter6.remotecontrol.device.Stereo;

public class RemoteLoader {
    
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
  
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
 
		GarageDoorOpenCommand garageDoorUp = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorDown = new GarageDoorCloseCommand(garageDoor);
 
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand  stereoOff = new StereoOffCommand(stereo);
 
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
  
		System.out.println(remoteControl);
 
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
    }

}
