package cn.zxy.command.command;

/**
 * @author Silence 000996
 * @data 17/6/20
 */
public interface Command {
    void execute();
    void undo();
}
