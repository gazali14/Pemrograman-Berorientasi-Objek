package customerinvoice;

/**
 *
 * @author U53R
 */
public class CustomerInvoice {

    public static void main(String[] args) {
        Customer customer = new Customer(1, "Gazali", 50);
        Invoice invoice = new Invoice(101, customer, 1000.0);
        System.out.println("Sebelum diskon : \n"+invoice.toString());

        double setelahDiskon = invoice.AmountAfterDiscount();
        invoice.setAmount(setelahDiskon);
        System.out.println("Setelah Diskon : \n" +  invoice.toString());
    }    
}
