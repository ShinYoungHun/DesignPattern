package Chapter6.remotecontrol.commands;

import Chapter6.remotecontrol.device.Stereo;

public class StereoOffCommand implements Command{

    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        
    }
    
}
