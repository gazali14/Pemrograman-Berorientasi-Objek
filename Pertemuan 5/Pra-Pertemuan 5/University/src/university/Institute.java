package university;

/**
 *
 * @author U53R
 */
public class Institute {
    private String name;
    private String address;

    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "Institute{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }    
}
