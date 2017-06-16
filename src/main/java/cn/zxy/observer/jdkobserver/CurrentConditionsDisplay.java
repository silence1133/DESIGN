package cn.zxy.observer.jdkobserver;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

/**
 * @author Silence 000996
 * @data 17/6/16
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float temp;
    private float humidity;

    /**
     * 构造的时候指定观察的subject以及加入当前作为观察者
     * @param observable
     */
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if(o instanceof  Observable){
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("当前：" + this.toString());
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                '}';
    }

}

