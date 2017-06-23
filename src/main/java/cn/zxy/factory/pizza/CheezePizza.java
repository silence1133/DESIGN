package cn.zxy.factory.pizza;

import cn.zxy.factory.PizzaIngredientFactory;

/**
 * @author Silence 000996
 * @data 17/6/19
 */
public class CheezePizza extends Pizza {
    private PizzaIngredientFactory factory;
    public CheezePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
        prepare();
    }

    public CheezePizza() {
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
        System.out.println("Cheeze");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("Cheeze");
    }

    @Override
    public void box() {
        super.box();
        System.out.println("Cheeze");
    }
}
