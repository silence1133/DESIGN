package cn.zxy.single;

/**
 * @author Silence 000996
 * @data 17/6/20
 */
public class Single {
    private volatile static Single instance;

    public static Single getInstance() {
        if(instance == null){
            synchronized (Single.class) {
                if (instance == null) {
                    return new Single();
                }
            }
        }
        return instance;
    }
}
