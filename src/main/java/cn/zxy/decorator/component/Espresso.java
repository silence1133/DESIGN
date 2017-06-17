package cn.zxy.decorator.component;

/**
 * 浓缩咖啡
 * @author Silence 000996
 * @data 17/6/17
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso（浓缩咖啡）";
    }

    public double cost() {
        return 1.99;
    }
}
