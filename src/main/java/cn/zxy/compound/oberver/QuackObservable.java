package cn.zxy.compound.oberver;

/**
 * @author Silence 000996
 * @data 17/7/11
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
