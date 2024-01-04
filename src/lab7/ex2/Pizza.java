package lab7.ex2;

import java.util.LinkedList;
import java.util.List;

public class Pizza {

    private String crust;
    private String sauce;
    private String cheese;
    private List<String> toppings;

    public Pizza() {
        this.toppings = new LinkedList<>();
    }

    public String getCrust() {
        return crust;
    }

    public String getSauce() {
        return sauce;
    }

    public String getCheese() {
        return cheese;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "crust='" + crust + "'" +
                ", sauce='" + sauce + "'" +
                ", cheese='" + cheese + "'" +
                ", toppings=" + toppings + "}";
    }
}
