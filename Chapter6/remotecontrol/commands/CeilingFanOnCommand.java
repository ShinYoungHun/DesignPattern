package Chapter6.remotecontrol.commands;

import Chapter6.remotecontrol.device.CeilingFan;

public class CeilingFanOnCommand implements Command{
    
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute(){
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        
    }

}
