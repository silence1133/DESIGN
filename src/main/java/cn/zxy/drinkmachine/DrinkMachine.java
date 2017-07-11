package cn.zxy.drinkmachine;

import cn.zxy.drinkmachine.payment.CoinPayment;
import cn.zxy.drinkmachine.payment.PayWayConstant;
import cn.zxy.drinkmachine.payment.Payment;
import cn.zxy.drinkmachine.payment.ScanCodePayment;
import cn.zxy.drinkmachine.product.*;
import cn.zxy.drinkmachine.unit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 饮料机
 * @author Silence 000996
 * @data 17/7/6
 */
public class DrinkMachine {
    //记录饮料机的所有饮料
    private List<Drink> drinks;
    //显示屏
    private Window window;
    //按钮
    private Button[] button;
    //投币口
    private CoinPort coinPort;
    //出货器
    private OutProductUnit outProductUnit;

    //两种付款方式
    private Payment[] payments;

    //记录客户选择的饮料
    private Drink chooseDrink;

    public DrinkMachine() {
        window = new Window();
        coinPort = new CoinPort();
        outProductUnit = new OutProductUnit();
        button = new Button[]{new ChooseProductButton(), new BackCoinButton()};
        payments = new Payment[]{new ScanCodePayment(), new CoinPayment(coinPort)};
        //初始化饮料
        initDrinks();
    }

    private void initDrinks() {
        drinks = new ArrayList<>();
        drinks.add(DrinkFactory.createDrink(DrinkTypeEnum.NONGFUSHANQUAN));
        drinks.add(DrinkFactory.createDrink(DrinkTypeEnum.PESSI));
    }

    //选择饮料
    public void chooseDrinks(String type) {
        button[0].pressButton();
        window.showProducts();//显示商品
        for (Drink d : drinks) {
            if (d.getName().equals(type)) {
                chooseDrink = d;
                break;
            }
        }
    }

    //付款
    public Drink payMoney(String payWay, float money) {
        Payment choosePayment;
        if (PayWayConstant.PAY_WAY_SCAN_CODE.equals(payWay)) {
            choosePayment = payments[0];
        } else {
            choosePayment = payments[1];
        }
        boolean success = choosePayment.pay(money, chooseDrink);
        if (!success) {//付款失败
            showPayResult();
            return null;
        } else {
            return outDrinks();
        }
    }

    //付款提示
    private void showPayResult() {
        window.showPayStatus();
    }

    //出饮料
    private Drink outDrinks() {
        if (drinks.contains(chooseDrink)) {
            drinks.remove(chooseDrink);
            outProductUnit.outDrink();
            return chooseDrink;
        } else {
            return null;
        }
    }

}
