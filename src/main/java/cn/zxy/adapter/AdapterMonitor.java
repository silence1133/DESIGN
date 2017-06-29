package cn.zxy.adapter;

/**
 * @author Silence 000996
 * @data 17/6/23
 */
public class AdapterMonitor {
    public static void main(String[] args) {
        //火鸡充当鸭子
        WildTurkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.fly();
        duck.quack();
    }
}
