package lab7.ex2;

public class ThinCrustPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;

    public ThinCrustPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildCrust() {
        pizza.setCrust("Thin Crust");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Regular Sauce");
    }

    @Override
    public void buildCheese() {
        pizza.setCheese("Mozzarella");
    }

    @Override
    public void buildToppings() {
        pizza.addTopping("Olio");
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }



}
