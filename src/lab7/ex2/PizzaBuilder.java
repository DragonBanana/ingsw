package lab7.ex2;

public interface PizzaBuilder {

    void buildCrust();
    void buildSauce();
    void buildCheese();
    void buildToppings();

    Pizza getPizza();

}
