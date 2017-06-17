package cn.zxy.decorator.component;

/**
 * 饮料基类
 * @author Silence 000996
 * @data 17/6/17
 */
public abstract class Beverage {
    String description = "unknow";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
