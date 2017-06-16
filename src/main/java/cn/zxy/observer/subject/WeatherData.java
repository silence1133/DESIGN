package cn.zxy.observer.subject;

import cn.zxy.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Silence 000996
 * @data 17/6/16
 */
public class WeatherData implements Subject {
    private float temp;
    private float humidity;
    private float pressure;
    private List<Observer> observerList;

    public WeatherData() {
        this.observerList = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        if(observerList.contains(observer)){
            this.observerList.remove(observer);
        }
    }

    public void notifyObservers() {
       for(Observer observer : observerList){
           observer.update(temp,humidity,pressure);
       }
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
        notifyObservers();
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        notifyObservers();
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        notifyObservers();
    }

}
