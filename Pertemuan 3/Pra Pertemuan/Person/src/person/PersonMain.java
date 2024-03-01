package person;

/**
 *
 * @author U53R
 */
public class PersonMain {
    public static void main(String args[]){
        Person person1 = new Person("Gazali","Jl Bonasel");
        System.out.println(person1.toString()+"]");
        
        Person person2 = new Person("La Ode","Jl Bonasut");
        System.out.println(person2.toString()+"]");                      
    }
}
