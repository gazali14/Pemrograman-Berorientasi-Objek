package customerinvoice;

/**
 *
 * @author U53R
 */
public class Customer {
    private int id,discount;
    private String name;
    
    public Customer(int id, String name, int discount){
        this.id = id;
        this.name = name;
        this.discount = discount;
    }
    
    public int getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getDiscount(){
        return discount;
    }
    
    public void setDiscount(int discount){
        this.discount = discount;
    }
    
    public String toString(){
        return name+"("+id+")("+discount+"%)";
    }
}
