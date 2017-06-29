package cn.zxy.facade;

/**
 * @author Silence 000996
 * @data 17/6/27
 */
public class DvdPlayer {
    private int level;

    public void on() {
        System.out.println("dvd on");
    }

    public void off() {
        System.out.println("dvd off");
    }

    public void play() {
        System.out.println("dvd play");
    }

    public void setVolumn(int level) {
        level = level;
    }
}
