package university;

/**
 *
 * @author U53R
 */
public class Faculty {
    private String name;
    private Employee dean;

    public Faculty(String name, Employee dean) {
        this.name = name;
        this.dean = dean;    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getDean() {
        return dean;
    }

    public void setDean(Employee dean) {
        this.dean = dean;
    }
    
    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", dean=" + dean +
                '}';
    }        
}
