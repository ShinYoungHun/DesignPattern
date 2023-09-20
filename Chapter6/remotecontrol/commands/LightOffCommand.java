package Chapter6.remotecontrol.commands;

import Chapter6.remotecontrol.device.Light;

public class LightOffCommand implements Command{
    
    Light light;
    
    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }

}
