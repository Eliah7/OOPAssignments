package Tutorial2.QN3;

/**
 * Created by Guest on 5/31/18.
 */
public class AnimalTest {
    public static void main(String args[]){
        Animal animal[] = new Animal[2];
        animal[0] = new Cat();
        animal[1] = new Horse();

        for (Animal myAnimal: animal) {
            myAnimal.sound();
        }
    }
}
