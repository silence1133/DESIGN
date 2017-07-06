package cn.zxy.drinkmachine;

import cn.zxy.drinkmachine.payment.PayWayConstant;
import cn.zxy.drinkmachine.product.Drink;

/**
 * @author Silence 000996
 * @data 17/7/6
 */
public class ClientTest {
    public static void main(String[] args) {
        DrinkMachine drinkMachine = new DrinkMachine();
        //1、选择一批饮料
        drinkMachine.chooseDrinks("pessi");

        //2、使用扫描支付，付款2元
        Drink drink = drinkMachine.payMoney(PayWayConstant.PAY_WAY_SCAN_CODE,2);

        System.out.println(drink);

    }
}
