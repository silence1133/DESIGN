package cn.zxy.command.invoker;

import cn.zxy.command.command.Command;
import cn.zxy.command.command.NoCommand;

/**
 * @author Silence 000996
 * @data 17/6/20
 */
public class RemoteControl {
    private Command[] onCommand;
    private Command[] offCommand;
    private Command undoCommand;

    public RemoteControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];
        Command command = new NoCommand();
        for (int i = 0; i < onCommand.length; i++) {
            onCommand[i] = command;
            offCommand[i] = command;
        }
    }

    public void setCommand(int slot, Command on, Command off) {
        onCommand[slot] = on;
        offCommand[slot] = off;
    }

    public void pressOnButton(int slot) {
        System.out.println("press on " + slot);
        onCommand[slot].execute();
        undoCommand = onCommand[slot];
    }


    public void pressOffButton(int slot) {
        System.out.println("press off " + slot);
        offCommand[slot].execute();
        undoCommand = offCommand[slot];
    }

    public void pressUndoButton(){
        System.out.println("press undo button ");
        undoCommand.undo();
    }
}
