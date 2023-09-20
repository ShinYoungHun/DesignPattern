package Chapter6.remotecontrol.commands;

import Chapter6.remotecontrol.device.Light;

public class LightOnCommand implements Command{

    Light light;
    
    public LightOnCommand(Light light){
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
    
}
