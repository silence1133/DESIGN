package cn.zxy.factory;

import cn.zxy.factory.material.*;

/**
 * @author Silence 000996
 * @data 17/6/20
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Clams createClams() {
        return new FrozenClams();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}
