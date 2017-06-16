package cn.zxy.observer;

import cn.zxy.observer.observer.CurrentConditionsDisplay;
import cn.zxy.observer.observer.ForecastDisplay;
import cn.zxy.observer.observer.Observer;
import cn.zxy.observer.subject.Subject;
import cn.zxy.observer.subject.WeatherData;

/**
 * @author Silence 000996
 * @data 17/6/16
 */
public class WeatherMonitor {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer currentConditionsDisplay = new CurrentConditionsDisplay();
        Observer forecastDisplay = new ForecastDisplay();
        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(forecastDisplay);

        weatherData.setTemp(1);
        weatherData.setPressure(1);
        weatherData.setHumidity(1);

    }
}
