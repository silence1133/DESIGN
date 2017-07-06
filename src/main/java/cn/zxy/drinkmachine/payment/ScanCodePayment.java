package cn.zxy.drinkmachine.payment;

import cn.zxy.drinkmachine.product.Drink;

/**
 * @author Silence 000996
 * @data 17/7/6
 */
public class ScanCodePayment implements Payment {
    
    @Override
    public boolean pay(double money, Drink drink) {
        if(money < drink.getPrice()){
            return false;
        }
        return true;
    }

    @Override
    public void backMoney(double money) {
        //走付款逻辑
    }
}
