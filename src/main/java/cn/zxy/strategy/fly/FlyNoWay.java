package cn.zxy.strategy.fly;

/**
 * @author Silence 000996
 * @data 17/6/15
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("can't fly");
    }
}
