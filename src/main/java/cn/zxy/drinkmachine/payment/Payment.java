package cn.zxy.drinkmachine.payment;

import cn.zxy.drinkmachine.product.Drink;

/**
 * @author Silence 000996
 * @data 17/7/6
 */
public interface Payment {
    /**
     * 付款
     * @param money
     * @param drink
     * @return
     */
    boolean pay(double money, Drink drink);

    /**
     * 退款
     * @param money
     */
    void backMoney(double money);
}
