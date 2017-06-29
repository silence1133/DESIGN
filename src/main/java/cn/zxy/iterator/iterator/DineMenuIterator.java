package cn.zxy.iterator.iterator;

import cn.zxy.iterator.MenuItem;

/**
 * @author Silence 000996
 * @data 17/6/27
 */
public class DineMenuIterator implements Iterator {

    private MenuItem[] menuItems;
    int position = 0;

    public DineMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
