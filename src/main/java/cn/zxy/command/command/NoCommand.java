package cn.zxy.command.command;

/**
 * @author Silence 000996
 * @data 17/6/20
 */
public class NoCommand implements Command {
    public void execute() {
        System.out.println("no command");
    }

    public void undo() {
        System.out.println("no command");
    }
}
