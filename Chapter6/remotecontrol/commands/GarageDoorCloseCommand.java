package Chapter6.remotecontrol.commands;

import Chapter6.remotecontrol.device.GarageDoor;

public class GarageDoorCloseCommand implements Command{

    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    public void execute(){
        garageDoor.down();
    }

    @Override
    public void undo() {
        
    }
    
}
