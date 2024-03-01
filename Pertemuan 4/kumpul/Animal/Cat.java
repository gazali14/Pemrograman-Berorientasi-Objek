package animal;

/**
 *
 * @author U53R
 */
public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }
    
    @Override
    public void greets(){
        System.out.println("Meow");
    }
}
