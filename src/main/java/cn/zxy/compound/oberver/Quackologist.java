package cn.zxy.compound.oberver;

import cn.zxy.compound.Quackable;

/**
 * @author Silence 000996
 * @data 17/7/11
 */
public class Quackologist implements Observer {
    @Override
    public void update(Quackable duck) {
        System.out.println(">>>>>"+duck);
    }
}
