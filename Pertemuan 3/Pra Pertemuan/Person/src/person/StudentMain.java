package person;

/**
 *
 * @author U53R
 */
public class StudentMain {
    public static void main(String args[]){
        Student student1 = new Student("Haris", "Pedati","KS",2020,1250.0);
        System.out.println(student1.toString());
        
        //update address dan program
        student1.setAddress("Bonsay");
        student1.setProgram("ST");
        System.out.println("\nSetelah diupdate : \n"+student1.toString());       
    }
}
