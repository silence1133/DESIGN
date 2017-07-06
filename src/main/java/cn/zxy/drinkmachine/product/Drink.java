package cn.zxy.drinkmachine.product;

/**
 * 饮料的抽象类
 *
 * @author Silence 000996
 * @data 17/7/6
 */
public abstract class Drink {
    protected String name;
    protected String description;
    protected double price;

    public Drink() {
        setName();
        setPrice();
        setDescription();
    }

    protected abstract void setName();

    protected abstract void setPrice();

    protected abstract void setDescription();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
