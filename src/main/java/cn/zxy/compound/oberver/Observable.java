package cn.zxy.compound.oberver;

import cn.zxy.compound.Quackable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Silence 000996
 * @data 17/7/11
 */
public class Observable implements QuackObservable {
    private List<Observer> observerList = new ArrayList<>();
    private Quackable duck;

    public Observable(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observerList.iterator();
        while (iterator.hasNext()){
            Observer o = iterator.next();
            o.update(duck);
        }
    }
}
