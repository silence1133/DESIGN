package cn.zxy.command;

import cn.zxy.command.command.LightOffCommand;
import cn.zxy.command.command.LightOnCommand;
import cn.zxy.command.command.StereoOffCommand;
import cn.zxy.command.command.StereoOnWithCDCommand;
import cn.zxy.command.invoker.RemoteControl;
import cn.zxy.command.receiver.Light;
import cn.zxy.command.receiver.Stereo;

/**
 * @author Silence 000996
 * @data 17/6/21
 */
public class RemoteControlMonitor {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        LightOnCommand onCommand = new LightOnCommand(light);
        LightOffCommand offCommand = new LightOffCommand(light);
        remoteControl.setCommand(1, onCommand, offCommand);

        Stereo stereo = new Stereo();
        remoteControl.setCommand(2, new StereoOnWithCDCommand(stereo), new StereoOffCommand(stereo));

        remoteControl.pressOnButton(1);
        remoteControl.pressOffButton(1);

        remoteControl.pressOnButton(2);
        remoteControl.pressOffButton(2);
        remoteControl.pressUndoButton();
    }
}
