package university;

/**
 *
 * @author U53R
 */
public abstract class Employee {
    private int ssNo;
    private String name;
    private String email;
    private int counter;

    public Employee(int ssNo, String name, String email, int counter) {
        this.ssNo = ssNo;
        this.name = name;
        this.email = email;
        this.counter = counter;
    }

    public int getSsNo() {
        return ssNo;
    }

    public void setSsNo(int ssNo) {
        this.ssNo = ssNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    public abstract double  attendence();
    
    @Override
    public String toString() {
       return "Employee{" +
              "socialSecurityNumber='" + ssNo + '\'' +
              ", name='" + name + '\'' +
              ", email='" + email + '\'' +
              '}';
    }
}
