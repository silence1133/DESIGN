package cn.zxy.compound.factory;

import cn.zxy.compound.Quackable;

/**
 * @author Silence 000996
 * @data 17/7/11
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
    public abstract Quackable createGoose();
}
