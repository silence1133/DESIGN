package cn.zxy.decorator.decorator;

import cn.zxy.decorator.component.Beverage;

/**
 * 摩卡（装饰者）
 * @author Silence 000996
 * @data 17/6/17
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    public double cost() {
        return 0.2+beverage.cost();
    }
}
