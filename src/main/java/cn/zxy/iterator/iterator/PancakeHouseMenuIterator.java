package cn.zxy.iterator.iterator;

import cn.zxy.iterator.MenuItem;

import java.util.List;

/**
 * @author Silence 000996
 * @data 17/6/27
 */
public class PancakeHouseMenuIterator implements Iterator {
    private List<MenuItem> menuItems;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
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
