package cn.zxy.command.command;

import cn.zxy.command.receiver.Light;

/**
 * @author Silence 000996
 * @data 17/6/20
 */
public class LightOffCommand implements Command {

    private Light light ;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
