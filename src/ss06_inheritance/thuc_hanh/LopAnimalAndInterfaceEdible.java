package ss06_inheritance.thuc_hanh;
import ss06_inheritance.thuc_hanh.Animal;
import ss06_inheritance.thuc_hanh.Chicken;
import ss06_inheritance.thuc_hanh.Tiger;
public class LopAnimalAndInterfaceEdible {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
    }
}
