package cn.zxy.state.state;

import cn.zxy.state.GumballMachine;

/**
 * @author Silence 000996
 * @data 17/6/29
 */
public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("please wait,we are already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry, you already turn the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getNumberGumballs() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
