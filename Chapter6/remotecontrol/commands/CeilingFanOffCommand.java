package Chapter6.remotecontrol.commands;

import Chapter6.remotecontrol.device.CeilingFan;

public class CeilingFanOffCommand implements Command{
    
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    public void execute(){
        ceilingFan.off();
    }

    public void undo() {
        
    }

}
