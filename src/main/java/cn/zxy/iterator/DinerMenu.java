package cn.zxy.iterator;

import cn.zxy.iterator.iterator.DineMenuIterator;
import cn.zxy.iterator.iterator.Iterator;

/**
 * @author Silence 000996
 * @data 17/6/27
 */
public class DinerMenu implements Menu {
    private MenuItem[] menuItems;
    private int number = 0;

    public DinerMenu() {
        this.menuItems = new MenuItem[6];
        addItem("diner_name_1", "diner_description_1", 1);
        addItem("diner_name_2", "diner_description_2", 2);

    }

    private void addItem(String name, String description, double price) {
        MenuItem menuItem = new MenuItem(name, description, price);
        menuItems[number] = menuItem;
        number = number + 1;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new DineMenuIterator(menuItems);
    }
}
