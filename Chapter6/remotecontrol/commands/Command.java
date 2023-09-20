package Chapter6.remotecontrol.commands;

public interface Command {
    public void execute();
    public void undo();
}
