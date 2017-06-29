package cn.zxy.composition;

import cn.zxy.composition.iterator.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Silence 000996
 * @data 17/6/28
 */
public class Menu extends MenuComponent {
    private List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name, String description) {
        super.name = name;
        super.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponentList.get(i);
    }

    @Override
    public void print() {
        System.out.println("name:" + super.name + ",description：" + super.description);
        System.out.println("----------------------------------");
        Iterator<MenuComponent> iterator = menuComponentList.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponentList.iterator());
    }
}
