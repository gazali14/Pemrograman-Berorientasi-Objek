package modul6;

/**
 *
 * @author lecturer
 */
import java.util.GregorianCalendar;
public class Main_Test {
    public static void main (String args []){  
        Orang lutfi = new Orang();
        lutfi.setNama("Lutfi");
        //lutfi.setTanggalLahir(new GregorianCalendar(2001, 1, 20));
        Orang rahma = new Orang("Rahma");
        rahma.setTanggalLahir(new GregorianCalendar(2015, 8, 31));
        
        System.out.println("Ada orang");                 
        System.out.println(lutfi.getNama()+" lahir pada "+lutfi.getTanggalLahir());
        try{
            lutfi.validatetanggallahir();
        }
        catch(Exception e){
            System.out.println("Info untuk Lutfi  "+ e.getMessage());
        }

        try{
            rahma.validatetanggallahir();
        }
        catch(Exception e){
            System.out.println("Info untuk rahma  "+ e.getMessage());
        }
        System.out.println(rahma.getNama()+" lahir pada "+rahma.getTanggalLahir());
    }
}
