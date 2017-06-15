package cn.zxy.strategy;

/**
 * @author Silence 000996
 * @data 17/6/15
 */
public class DuckMonitor {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelQuack = new ModelQuack();
        modelQuack.display();
        modelQuack.swim();
        modelQuack.performFly();
        modelQuack.performQuack();
    }
}
