package cn.zxy.command.command;

import cn.zxy.command.receiver.Stereo;

/**
 * @author Silence 000996
 * @data 17/6/23
 */
public class StereoOnWithCDCommand implements Command {

    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolumn(10);
    }

    public void undo() {
        stereo.off();
    }
}
