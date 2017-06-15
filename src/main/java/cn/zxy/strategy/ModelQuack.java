package cn.zxy.strategy;

import cn.zxy.strategy.fly.FlyNoWay;
import cn.zxy.strategy.fly.FlyWithWinds;
import cn.zxy.strategy.quack.MuteQuack;
import cn.zxy.strategy.quack.Quack;

/**
 * @author Silence 000996
 * @data 17/6/15
 */
public class ModelQuack extends Duck {
    public ModelQuack(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    public void display() {
        System.out.println("模型鸭（不会叫，不会飞）");
    }
}
