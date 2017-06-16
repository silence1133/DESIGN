package cn.zxy.observer.jdkobserver;

/**
 * @author Silence 000996
 * @data 17/6/16
 */
public class WeatherMonitor {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setTemp(1);
    }
}
