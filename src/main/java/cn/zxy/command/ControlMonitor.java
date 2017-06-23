package cn.zxy.command;

import cn.zxy.command.command.Command;
import cn.zxy.command.command.LightOnCommand;
import cn.zxy.command.invoker.SimpleRemoteControl;
import cn.zxy.command.receiver.Light;

/**
 * @author Silence 000996
 * @data 17/6/20
 */
public class ControlMonitor {
    public static void main(String[] args) {
        Light light = new Light();
        Command command = new LightOnCommand(light);
        SimpleRemoteControl control = new SimpleRemoteControl();
        control.pressButton();
    }
}
