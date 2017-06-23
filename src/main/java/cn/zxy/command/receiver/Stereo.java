package cn.zxy.command.receiver;

/**
 * @author Silence 000996
 * @data 17/6/23
 */
public class Stereo {
    private int level;
    public void on(){
        System.out.println("Stereo on");
    };

    public void setCD(){
        System.out.println("Stereo setCD");
    }

    public void setVolumn(int level){
        System.out.println("setVolumn "+level);
        this.level = level;
    }

    public void off(){
        System.out.println("Stereo off");
    };

}
