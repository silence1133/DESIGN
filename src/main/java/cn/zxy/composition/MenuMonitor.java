package cn.zxy.composition;

import java.util.Iterator;

/**
 * @author Silence 000996
 * @data 17/6/28
 */
public class MenuMonitor {
    public static void main(String[] args) {
        MenuComponent allMenus = new Menu("ALL MENUS","ALL MENUS COMBINED");

        MenuComponent dinnerMenu = new Menu("DINNER MENU","DINNER MENU");
        MenuComponent cafeMenu = new Menu("cafe menu","cafe menu");

        MenuComponent pastaMenuItem = new MenuItem("pasta","pasta",1);
        dinnerMenu.add(pastaMenuItem);

        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);
//
//        Waitress waitress = new Waitress(allMenus);
//        waitress.printMenu();

        Iterator iterator = allMenus.createIterator();
        System.out.println(iterator.next());
    }
}
