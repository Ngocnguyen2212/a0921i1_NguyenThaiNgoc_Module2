package ss07_AbtractClass_Interface.thuc_hanh;

import ss07_AbtractClass_Interface.thuc_hanh.Animal;

public class Chicken extends Animal {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }
}

