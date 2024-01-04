package lab7.ex2;

public class Main {

    public static void main(String[] args) {

        PizzaDirector director = new PizzaDirector();

        PizzaBuilder builder = new ThinCrustPizzaBuilder();

        Pizza pizza = director.construct(builder);

        System.out.println(pizza);
    }



}
