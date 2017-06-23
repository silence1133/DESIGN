package cn.zxy.factory.pizza;

import cn.zxy.factory.PizzaIngredientFactory;

/**
 * @author Silence 000996
 * @data 17/6/19
 */
public class ClamPizza extends Pizza {
    private PizzaIngredientFactory factory;

    public ClamPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }
    public ClamPizza() {
    }

    @Override
    public void prepare() {
        System.out.println("prepare:"+name);
        cheese = factory.createCheese();
        dough = factory.createDough();
        clams = factory.createClams();
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Clam");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("Clam");
    }

    @Override
    public void box() {
        super.box();
        System.out.println("Clam");
    }
}
