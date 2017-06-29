package cn.zxy.facade;

/**
 * @author Silence 000996
 * @data 17/6/27
 */
public class HomeTheaterFacade {
    private DvdPlayer dvdPlayer;
    private Light light;
    private Screen screen;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, Light light, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.light = light;
        this.screen = screen;
    }
    public void watchMovie(){
        this.screen.down();
        this.dvdPlayer.on();
        this.dvdPlayer.play();
        this.dvdPlayer.setVolumn(20);
        this.light.off();
    }
}
