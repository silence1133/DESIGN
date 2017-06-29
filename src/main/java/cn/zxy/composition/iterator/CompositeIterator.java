package cn.zxy.composition.iterator;

import cn.zxy.composition.Menu;
import cn.zxy.composition.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author Silence 000996
 * @data 17/6/29
 */
public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator> stack = new Stack<Iterator>();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }else{
            Iterator iterator = stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else{
                return true;
            }
        }
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator iterator = stack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if(menuComponent instanceof Menu){
                stack.push(menuComponent.createIterator());
            }
            return menuComponent;
        }
        return null;
    }
}
