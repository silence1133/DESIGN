package cn.zxy.compound;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Silence 000996
 * @data 17/7/11
 */
public class Flock implements Quackable {

    private List<Quackable> duckList = new ArrayList<>();

    public void add(Quackable duck){
        duckList.add(duck);
    }

    @Override
    public void quack() {
       Iterator<Quackable> quackableIterator = duckList.iterator();
       while (quackableIterator.hasNext()){
           Quackable quackable = quackableIterator.next();
           quackable.quack();
       }
    }
}
