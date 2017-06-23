package cn.zxy.command.command;

import cn.zxy.command.receiver.Stereo;

/**
 * @author Silence 000996
 * @data 17/6/23
 */
public class StereoOffCommand implements Command {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    public void execute() {
        stereo.off();
    }

    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolumn(10);
    }
}
