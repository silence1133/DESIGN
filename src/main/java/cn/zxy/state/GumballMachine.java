package cn.zxy.state;

import cn.zxy.state.state.*;

/**
 * @author Silence 000996
 * @data 17/6/29
 */
public class GumballMachine {

    private State state;
    private int numberGumballs;

    private State noQuarterState;
    private State soldState;
    private State soldOutState;
    private State hasQuarterState;

    public GumballMachine(int numberGumballs) {
        numberGumballs = numberGumballs;
        if (numberGumballs > 0) {
            state = new NoQuarterState(this);
        }

        noQuarterState = new NoQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        hasQuarterState = new HasQuarterState(this);
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot");
        if(numberGumballs != 0){
            numberGumballs--;
        }
    }

    public int getNumberGumballs() {
        return numberGumballs;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void dispense() {
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }
}
