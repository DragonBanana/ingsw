package lab7.ex1;

public class Main {


    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Il costo di un SimpleCoffee e': " + coffee.cost());

        Coffee sugarCoffee = new SugarDecorator(coffee);
        System.out.println("Il costo di un SimpleCoffee con zucchero e': " + sugarCoffee.cost());

        Coffee sugarMilkCoffee = new MilkDecorator(sugarCoffee);
        System.out.println("Il costo di un SimpleCoffee con zucchero e latte e': " + sugarMilkCoffee.cost());
    }

}
