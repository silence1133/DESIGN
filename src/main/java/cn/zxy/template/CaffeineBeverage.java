package cn.zxy.template;

/**
 * @author Silence 000996
 * @data 17/6/27
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        //1、把水煮沸
        boilWater();
        //2、用沸水冲泡咖啡/或者是茶
        brew();
        //3、倒入杯中
        pourInCup();
        //4、加配料
        addCondiments();
    }

    private void boilWater() {
        //具体实现
    }

    protected abstract void brew();

    private void pourInCup() {
        //具体实现
    }

    protected abstract void addCondiments();

}
