package cn.zxy.observer.jdkobserver;

import java.util.Observable;

/**
 * @author Silence 000996
 * @data 17/6/16
 */
public class WeatherData extends Observable{
    private float temp;
    private float humidity;
    private float pressure;

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
        measurementsChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        measurementsChanged();
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        measurementsChanged();
    }
}
