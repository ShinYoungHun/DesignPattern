package Chapter6.remotecontrol.commands;

import Chapter6.remotecontrol.device.Stereo;

public class StereoOnWithCDCommand implements Command{

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    public void undo() {

    }
    
}
