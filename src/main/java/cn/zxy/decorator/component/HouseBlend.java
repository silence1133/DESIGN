package cn.zxy.decorator.component;

/**
 * 综合咖啡
 * @author Silence 000996
 * @data 17/6/17
 */
public class HouseBlend extends Beverage {
    public double cost() {
        return 0.89;
    }

    public HouseBlend() {
        description = "HouseBlend(综合咖啡)";
    }
}
