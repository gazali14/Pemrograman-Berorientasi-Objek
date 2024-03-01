package person;

/**
 *
 * @author U53R
 */
public class StaffMain {
    public static void main(String args[]){
        Staff staff1 =new Staff("Andre", "Pondok Betung","Polstat STIS",9000);
        System.out.println(staff1.toString());
        
        staff1.setAddress("Pondok bambu");
        staff1.setPay(10000);
        System.out.println("\nSetelah diupdate : \n"+staff1.toString());
    }
}
