package cn.zxy.factory;

import cn.zxy.factory.pizza.Pizza;

/**
 * @author Silence 000996
 * @data 17/6/19
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
