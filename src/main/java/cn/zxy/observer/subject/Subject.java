package cn.zxy.observer.subject;

import cn.zxy.observer.observer.Observer;

/**
 * @author Silence 000996
 * @data 17/6/16
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
