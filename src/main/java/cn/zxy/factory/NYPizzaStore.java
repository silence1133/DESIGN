package cn.zxy.factory;

import cn.zxy.factory.pizza.CheezePizza;
import cn.zxy.factory.pizza.Pizza;

/**
 * @author Silence 000996
 * @data 17/6/20
 */
public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        Pizza pizza = new CheezePizza(factory);
        pizza.setName("NY");
        return pizza;
    }
}
