package lab7.ex2;

public class PizzaDirector {

    public Pizza construct(PizzaBuilder builder) {
        builder.buildCrust();
        builder.buildSauce();
        builder.buildCheese();
        builder.buildToppings();
        return builder.getPizza();
    }

}
