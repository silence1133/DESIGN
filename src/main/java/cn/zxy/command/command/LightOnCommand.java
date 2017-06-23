package cn.zxy.command.command;

import cn.zxy.command.receiver.Light;

/**
 * @author Silence 000996
 * @data 17/6/20
 */
public class LightOnCommand implements Command{
    private Light light ;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }

}
