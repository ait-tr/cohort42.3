package homework17.pets;

import homework17.pets.model.Cat;
import homework17.pets.model.Dog;

public class PetAppl {
    public static void main(String[] args) {

        Cat cat = new Cat(1, "cat ", 2, "Murka", "brit", 5, 30);
        Dog dog = new Dog(2, "dog ", 3, "Redy", "pudel", 6, 40 );

        cat.display();
        cat.voice();
        dog.display();
        dog.voice();

    }
}
