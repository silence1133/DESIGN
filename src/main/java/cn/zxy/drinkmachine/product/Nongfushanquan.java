package cn.zxy.drinkmachine.product;

/**
 * @author Silence 000996
 * @data 17/7/6
 */
public class Nongfushanquan extends Drink {
    @Override
    protected void setName() {
        super.name = "nfsq";
    }

    @Override
    protected void setPrice() {
        super.price = 2;
    }

    @Override
    protected void setDescription() {
        super.description = "农夫山泉";
    }
}
