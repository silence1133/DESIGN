package cn.zxy.adapter;

/**
 * @author Silence 000996
 * @data 17/6/26
 */
public class TurkeyAdapter2 extends WildTurkey implements Duck  {
    @Override
    public void quack() {
        super.gobble();
    }

    @Override
    public void fly() {
        super.fly();
    }
}
