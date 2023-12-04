package lab6.ex6;

public class Main {

    public static void main(String[] args) {
        DogSchool dogSchool = new DogSchool();
        dogSchool.populate();
        dogSchool.makeSound();

        CatSchool catSchool = new CatSchool();
        catSchool.populate();
        catSchool.makeSound();
    }

}
