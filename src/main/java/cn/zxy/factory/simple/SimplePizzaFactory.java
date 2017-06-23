package cn.zxy.factory.simple;

import cn.zxy.factory.pizza.CheezePizza;
import cn.zxy.factory.pizza.ClamPizza;
import cn.zxy.factory.pizza.Pizza;
import cn.zxy.factory.pizza.VeggiePizza;

/**
 * @author Silence 000996
 * @data 17/6/19
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        if("clam".equalsIgnoreCase(type)){
            return new ClamPizza();
        }
        else if("cheeze".equalsIgnoreCase(type)){
            return new CheezePizza();
        }
        else{
            return new VeggiePizza();
        }
    }
}
