package Chapter6.remotecontrol;

import Chapter6.remotecontrol.commands.GarageDoorOpenCommand;
import Chapter6.remotecontrol.commands.LightOnCommand;
import Chapter6.remotecontrol.device.GarageDoor;
import Chapter6.remotecontrol.device.Light;

public class RemoteControlTest {
    
    public static void main(String[] args){

        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("");
        GarageDoor garageDoor = new GarageDoor("");
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }

}
