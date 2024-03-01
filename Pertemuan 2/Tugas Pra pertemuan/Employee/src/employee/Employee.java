package employee;

/**
 *
 * @author U53R
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    
    public Employee(int id, String fName, String lName, int salary)
    {
        this.id=id;
        this.firstName=fName;
        this.lastName=lName;
        this.salary=salary;
    }
    
    public int getID()
    {
        return id;
    }
    
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
    
    public String getName()
    {
        return (firstName + " " + lastName);
    }
    
    public int getSalary()
    {
        return salary;
    }
    
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    
    public int getAnnualSalary()
    {
        return (this.salary*12);
    }
    
    public int raiseSalary(int percent){
        this.salary = (int) (this.salary * (1 + percent / 100.0));
        return this.salary;
    }

    
    public String toString()
    {
        return ("\nEmployee[id="+this.id+",name="+this.firstName+" "+this.lastName+",salary="+this.salary+"]");
    }
}

