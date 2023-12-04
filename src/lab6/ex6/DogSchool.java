package lab6.ex6;

import java.util.List;

public class DogSchool extends AbstractPetSchool {

    @Override
    public Pet makePet() {
        return new Dog();
    }
}
