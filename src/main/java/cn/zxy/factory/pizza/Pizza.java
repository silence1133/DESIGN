package cn.zxy.factory.pizza;

import cn.zxy.factory.material.Cheese;
import cn.zxy.factory.material.Clams;
import cn.zxy.factory.material.Dough;

/**
 * @author Silence 000996
 * @data 17/6/19
 */
public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Cheese cheese;
    protected Clams clams;

    abstract void prepare();

    public void bake() {
        System.out.println("bake");
    }

    public void cut() {
        System.out.println("cut");
    }

    public void box() {
        System.out.println("box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
