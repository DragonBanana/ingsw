package lab6.ex6;

import java.util.List;

public class CatSchool extends AbstractPetSchool {

    public Pet makePet() {
        return new Cat();
    }

}
