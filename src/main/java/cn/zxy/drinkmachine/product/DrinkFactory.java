package cn.zxy.drinkmachine.product;

/**
 * 获取饮料的工厂类
 * @author Silence 000996
 * @data 17/7/6
 */
public class DrinkFactory {
    public static Drink createDrink(DrinkTypeEnum typeEnum) {
        if(typeEnum == null){
            throw new IllegalArgumentException();
        }
        if (typeEnum.equals(DrinkTypeEnum.NONGFUSHANQUAN)) {
            return new Nongfushanquan();
        }
        if (typeEnum.equals(DrinkTypeEnum.PESSI)) {
            return new Pessi();
        }
        return null;
    }
}
