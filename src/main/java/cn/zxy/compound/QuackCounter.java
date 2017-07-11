package cn.zxy.compound;

/**
 * 用于给鸭子叫增加计数行为的装饰类
 * @author Silence 000996
 * @data 17/7/11
 */
public class QuackCounter implements Quackable {
    private Quackable duck;

    private static int numberOfQuacks=0;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        numberOfQuacks++;
        this.duck.quack();
    }

    public static int getNumberOfQuacks(){
        return numberOfQuacks;
    }
}
