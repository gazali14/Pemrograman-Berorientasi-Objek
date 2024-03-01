package employee;

/**
 *
 * @author U53R
 */
public class Main_Employee {
    public static void main(String[] args)
    {
        Employee employee1 = new Employee(1,"La Ode Muhammad","Gazali",5000);
        System.out.println("id :"+employee1.getID());
        System.out.println("Name :"+employee1.getName());
        System.out.println("Salary :"+employee1.getSalary());
        System.out.println("Annual Salary :"+employee1.getAnnualSalary());
        System.out.println("Raise salary by 5% :"+employee1.raiseSalary(5)); 
        System.out.println(employee1.toString());  
    }   
}

