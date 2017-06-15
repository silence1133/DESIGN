package cn.zxy.strategy;

import cn.zxy.strategy.fly.FlyWithWinds;
import cn.zxy.strategy.quack.Quack;

/**
 * @author Silence 000996
 * @data 17/6/15
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        setFlyBehavior(new FlyWithWinds());
        setQuackBehavior(new Quack());
    }
    public void display() {
        System.out.println("绿头鸭（呱呱叫、会飞）");
    }
}
