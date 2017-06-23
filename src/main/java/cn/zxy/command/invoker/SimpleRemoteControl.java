package cn.zxy.command.invoker;

import cn.zxy.command.command.Command;

/**
 * @author Silence 000996
 * @data 17/6/20
 */
public class SimpleRemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
