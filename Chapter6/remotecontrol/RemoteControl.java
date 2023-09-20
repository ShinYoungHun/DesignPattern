package Chapter6.remotecontrol;

import Chapter6.remotecontrol.commands.Command;
import Chapter6.remotecontrol.commands.NoCommand;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for(int i=0;i<7;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    public String toString(){
        int i = 0;
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n---------- 리모컨 ----------\n");
        for(i=0; i<onCommands.length; i++){
            stringBuff.append("[slot "+i+"] "+ onCommands[i].getClass().getName() + "   " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuff.append("[slot "+i+1+"] "+ undoCommand.getClass().getName() + "   " + undoCommand.getClass().getName() + "\n");
        return stringBuff.toString();
    }
    
}
