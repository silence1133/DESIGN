package cn.zxy.state.state;

import cn.zxy.state.GumballMachine;

/**
 * @author Silence 000996
 * @data 17/6/29
 */
public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("sold out");
    }

    @Override
    public void dispense() {
        System.out.println("sold out");
    }
}
