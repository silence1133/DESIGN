package cn.zxy.drinkmachine.product;

/**
 * @author Silence 000996
 * @data 17/7/6
 */
public class Pessi extends Drink {
    @Override
    public void setName() {
        super.name = "pessi";
    }

    @Override
    public void setPrice() {
        super.price = 3d;
    }

    @Override
    public void setDescription() {
        super.description = "百事可乐";
    }
}
