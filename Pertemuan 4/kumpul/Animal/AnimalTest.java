package animal;

/**
 *
 * @author U53R
 */
public class AnimalTest {
    public static void main(String args[]){
        Cat cat = new Cat("Cepot");
        System.out.print(cat.getName()+" says: ");
        cat.greets();

        Dog Doggy = new Dog("Dero");
        System.out.print(Doggy.getName()+" says: ");
        Doggy.greets();

        BigDog BigDoggy = new BigDog("Dimas");
        System.out.print(BigDoggy.getName()+" says: ");
        BigDoggy.greets();

        System.out.print(Doggy.getName()+" reply: ");
        Doggy.greets(BigDoggy);
        
        System.out.print(BigDoggy.getName()+" reply again: ");
        BigDoggy.greets(Doggy);
    }
}
