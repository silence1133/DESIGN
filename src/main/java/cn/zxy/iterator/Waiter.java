package cn.zxy.iterator;

import cn.zxy.iterator.iterator.Iterator;

import java.util.List;

/**
 * @author Silence 000996
 * @data 17/6/27
 */
public class Waiter {
    public void printMenu(){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        List<MenuItem> menuItemList = pancakeHouseMenu.getMenuItems();
        MenuItem[] menuItems = dinerMenu.getMenuItems();
        //遍历menuItemList
        for (int i = 0; i < menuItemList.size(); i++) {
            MenuItem menuItem = menuItemList.get(i);
            //打印出菜单项，代码省略。。
        }
        //遍历menuItems
        for (int i = 0; i < menuItems.length; i++) {
            MenuItem menuItem = menuItems[i];
            //打印出菜单项，代码省略。。
        }
    }
    public void printMenuIterator(){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Iterator iterator1 = pancakeHouseMenu.createIterator();
        Iterator iterator2 = dinerMenu.createIterator();
        printMenu(iterator1);
        printMenu(iterator2);

    }

    private void printMenu(Iterator iterator) {
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem);
        }
    }
}
