package cn.zxy.compound;

/**
 * 鹅适配器
 * @author Silence 000996
 * @data 17/7/11
 */
public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
