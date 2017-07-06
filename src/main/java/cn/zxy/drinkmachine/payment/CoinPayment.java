package cn.zxy.drinkmachine.payment;

import cn.zxy.drinkmachine.product.Drink;
import cn.zxy.drinkmachine.unit.CoinPort;

/**
 * @author Silence 000996
 * @data 17/7/6
 */
public class CoinPayment implements Payment {
    private CoinPort coinPort;

    public CoinPayment(CoinPort coinPort) {
        this.coinPort = coinPort;
    }

    @Override
    public boolean pay(double money, Drink drink) {
        coinPort.in(money);

        if(money < drink.getPrice()){
            return false;
        }
        return true;
    }

    @Override
    public void backMoney(double money) {
        coinPort.out(money);
    }
}
