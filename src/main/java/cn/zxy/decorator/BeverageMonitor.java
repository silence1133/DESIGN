package cn.zxy.decorator;

import cn.zxy.decorator.component.Beverage;
import cn.zxy.decorator.component.Espresso;
import cn.zxy.decorator.decorator.Mocha;
import cn.zxy.decorator.decorator.Whip;

/**
 * @author Silence 000996
 * @data 17/6/17
 */
public class BeverageMonitor {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();//浓缩咖啡
        System.out.println(beverage.getDescription()+" $" + beverage.cost());

        Beverage beverage1 = new Mocha(beverage);//加摩卡
        Beverage beverage2 = new Whip(beverage1);//加奶泡
        System.out.println(beverage2.getDescription()+" $" + beverage2.cost());
    }
}