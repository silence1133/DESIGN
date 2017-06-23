package cn.zxy.factory;

import cn.zxy.factory.material.Cheese;
import cn.zxy.factory.material.Clams;
import cn.zxy.factory.material.Dough;

/**
 * @author Silence 000996
 * @data 17/6/19
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Clams createClams();
    Cheese createCheese();
}
