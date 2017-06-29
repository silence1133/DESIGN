package cn.zxy.composition;

import java.lang.*;
import java.util.Iterator;

/**
 * @author Silence 000996
 * @data 17/6/28
 */
public abstract class MenuComponent {
    protected String name;
    protected String description;

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    //菜单项和菜单共同拥有一样的行为，直接提供默认的实现，子类直接继承使用。
    public String getName() {
        return name;
    }

    //菜单项和菜单共同拥有一样的行为，直接提供默认的实现，子类直接继承使用。
    public String getDescription() {
        return description;
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }
}
