package cn.zxy.decorator.decorator;

import cn.zxy.decorator.component.Beverage;

/**
 * 装饰者
 * @author Silence 000996
 * @data 17/6/17
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
