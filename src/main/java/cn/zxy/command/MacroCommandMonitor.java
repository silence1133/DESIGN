package cn.zxy.command;

import cn.zxy.command.command.Command;
import cn.zxy.command.command.LightOnCommand;
import cn.zxy.command.command.MacroCommand;
import cn.zxy.command.command.StereoOnWithCDCommand;
import cn.zxy.command.receiver.Light;
import cn.zxy.command.receiver.Stereo;

/**
 * 宏命令测试
 *
 * @author Silence 000996
 * @data 17/6/23
 */
public class MacroCommandMonitor {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand onCommand = new LightOnCommand(light);

        Stereo stereo = new Stereo();
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);

        Command[] commands = {onCommand, stereoOnWithCDCommand};
        MacroCommand macroCommand = new MacroCommand(commands);
        macroCommand.execute();
    }
}
