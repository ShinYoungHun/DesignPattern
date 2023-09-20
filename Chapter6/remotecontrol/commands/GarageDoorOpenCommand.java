package Chapter6.remotecontrol.commands;

import Chapter6.remotecontrol.device.GarageDoor;

public class GarageDoorOpenCommand implements Command{

    GarageDoor garageDoor;
    
    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    public void execute(){
        garageDoor.up();
    }

    public void undo() {
        
    }

}
