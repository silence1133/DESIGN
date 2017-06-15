package cn.zxy.strategy.quack;

/**
 * @author Silence 000996
 * @data 17/6/15
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Silence");
    }
}
