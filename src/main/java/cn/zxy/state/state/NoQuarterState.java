package cn.zxy.state.state;

import cn.zxy.state.GumballMachine;

/**
 * @author Silence 000996
 * @data 17/6/29
 */
public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("insert quarter!");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("you need to pay first");
    }
}
