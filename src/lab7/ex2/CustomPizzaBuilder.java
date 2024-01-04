package lab7.ex2;

public class CustomPizzaBuilder {

    Pizza pizza;

    public CustomPizzaBuilder() {
        pizza = new Pizza();
    }

    public CustomPizzaBuilder buildCrust(String crust) {
        this.pizza.setCrust(crust);
        return this;
    }

    public CustomPizzaBuilder buildSauce(String sauce) {
        this.pizza.setSauce(sauce);
        return this;
    }

    public CustomPizzaBuilder buildCheese(String cheese) {
        this.pizza.setCheese(cheese);
        return this;
    }

    public Pizza getPizza() {
        return this.pizza;
    }

    public static void main(String[] args) {
        CustomPizzaBuilder builder = new CustomPizzaBuilder();

        builder
                .buildCrust("Thin Crust")
                .buildSauce("Regular Sauce")
                .getPizza();
    }

}
