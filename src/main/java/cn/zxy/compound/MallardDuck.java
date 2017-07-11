package cn.zxy.compound;

import cn.zxy.compound.oberver.Observable;
import cn.zxy.compound.oberver.Observer;
import cn.zxy.compound.oberver.QuackObservable;

/**
 * @author Silence 000996
 * @data 17/7/11
 */
public class MallardDuck implements Quackable,QuackObservable {
    private Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
