package cn.zxy.adapter;

/**
 * @author Silence 000996
 * @data 17/6/23
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
