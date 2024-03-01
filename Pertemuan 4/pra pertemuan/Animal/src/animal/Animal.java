package animal;

/**
 *
 * @author U53R
 */
public abstract class Animal {
    private String name;
    
    public Animal(String name){
        this.name = name;
    }
    
    public abstract void greets();
    
    public String getName(){
        return name;
    }
}
