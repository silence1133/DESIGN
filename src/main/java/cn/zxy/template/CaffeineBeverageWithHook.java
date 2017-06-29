package cn.zxy.template;

/**
 * @author Silence 000996
 * @data 17/6/27
 */
public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        //1、把水煮沸
        boilWater();
        //2、用沸水冲泡咖啡/或者是茶
        brew();
        //3、倒入杯中
        pourInCup();
        //是否加配料可以由子类决定
        if(customerWantsCondiments()) {
            //4、加配料
            addCondiments();
        }
    }
    /**
     * 子类可以决定是否覆盖这个方法，子类可以选择不覆盖，不覆盖就默认加配料。
     * @return
     */
    private boolean customerWantsCondiments() {
        return true;
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
