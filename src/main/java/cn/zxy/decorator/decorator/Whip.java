package cn.zxy.decorator.decorator;

import cn.zxy.decorator.component.Beverage;

/**
 * 奶泡（装饰者）
 *
 * @author Silence 000996
 * @data 17/6/17
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    public double cost() {
        return 0.1+beverage.cost();
    }
}
