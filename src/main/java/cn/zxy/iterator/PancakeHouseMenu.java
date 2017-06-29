package cn.zxy.iterator;

import cn.zxy.iterator.iterator.Iterator;
import cn.zxy.iterator.iterator.PancakeHouseMenuIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Silence 000996
 * @data 17/6/27
 */
public class PancakeHouseMenu implements Menu {
    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("name_1", "description_1", 1);
        addItem("name_2", "description_2", 2);
    }

    private void addItem(String name, String description, double price) {
        MenuItem menuItem = new MenuItem(name, description, price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
