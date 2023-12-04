package lab6.ex6;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPetSchool implements PetSchool {

    private List<Pet> students = new ArrayList<>();

    public void makeSound() {
        students.stream().forEach(Pet::makeSound);
    }

    public void populate() {
        for(int i=0; i<50; i++) {
            students.add(this.makePet());
        }
    }

}
