package cn.zxy.observer.observer;

/**
 * @author Silence 000996
 * @data 17/6/16
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {
    private float temp;
    private float humidity;

    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.display();
    }

    public void display() {
        System.out.println("当前："+this.toString());
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                '}';
    }
}
