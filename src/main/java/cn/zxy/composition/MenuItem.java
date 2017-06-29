package cn.zxy.composition;

/**
 * @author Silence 000996
 * @data 17/6/28
 */
public class MenuItem extends MenuComponent {
    private double price;

    public MenuItem(String name, String description, double price) {
        super.name = name;
        super.description = description;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("\tname:" + super.name + ",description：" + super.description + ",price：" + price + "\n");
    }
}
