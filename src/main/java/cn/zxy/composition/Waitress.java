package cn.zxy.composition;

/**
 * @author Silence 000996
 * @data 17/6/28
 */
public class Waitress {
    private MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void printMenu(){
        menuComponent.print();
    }

}
