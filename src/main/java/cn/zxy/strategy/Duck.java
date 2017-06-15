package cn.zxy.strategy;

import cn.zxy.strategy.fly.FlyBehavior;
import cn.zxy.strategy.quack.QuackBehavior;

/**
 * @author Silence 000996
 * @data 17/6/15
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public void swim() {
        System.out.println("swim");
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
