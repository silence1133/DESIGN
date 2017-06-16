package cn.zxy.observer.observer;

/**
 * @author Silence 000996
 * @data 17/6/16
 */
public class ForecastDisplay implements DisplayElement, Observer {
    private float temp;
    private float humidity;
    private float pressure;

    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }

    public void display() {
        System.out.println("根据气压和当前问题预报天气："+toString());
    }

    @Override
    public String toString() {
        return "ForecastDisplay{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
