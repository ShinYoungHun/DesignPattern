package Chapter6.remotecontrol;

import Chapter6.remotecontrol.commands.CeilingFanOffCommand;
import Chapter6.remotecontrol.commands.CeilingFanOnCommand;
import Chapter6.remotecontrol.commands.Command;
import Chapter6.remotecontrol.commands.GarageDoorCloseCommand;
import Chapter6.remotecontrol.commands.GarageDoorOpenCommand;
import Chapter6.remotecontrol.commands.LightOffCommand;
import Chapter6.remotecontrol.commands.LightOnCommand;
import Chapter6.remotecontrol.commands.MacroCommand;
import Chapter6.remotecontrol.commands.StereoOffCommand;
import Chapter6.remotecontrol.commands.StereoOnWithCDCommand;
import Chapter6.remotecontrol.device.CeilingFan;
import Chapter6.remotecontrol.device.GarageDoor;
import Chapter6.remotecontrol.device.Light;
import Chapter6.remotecontrol.device.Stereo;

public class RemoteLoaderMacro {
    
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		GarageDoorOpenCommand garageDoorUp = new GarageDoorOpenCommand(garageDoor);
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);

		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		GarageDoorCloseCommand garageDoorDown = new GarageDoorCloseCommand(garageDoor);
		StereoOffCommand  stereoOff = new StereoOffCommand(stereo);
     
        Command[] onMacroCommands = {livingRoomLightOn,kitchenLightOn,ceilingFanOn,garageDoorUp,stereoOnWithCD};
        Command[] offMacroCommands = {livingRoomLightOff,kitchenLightOff,ceilingFanOff,garageDoorDown,stereoOff};
        MacroCommand onMacroCommand = new MacroCommand(onMacroCommands);
        MacroCommand offMacroCommand = new MacroCommand(offMacroCommands);
        
 
		remoteControl.setCommand(0, onMacroCommand, offMacroCommand);
  
		System.out.println(remoteControl);

        System.out.println("--- 매크로 On ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- 매크로 Off ---");
        remoteControl.offButtonWasPushed(0);
        System.out.println("--- Undo ---");
        remoteControl.undoButtonWasPushed();
 
    }

}
