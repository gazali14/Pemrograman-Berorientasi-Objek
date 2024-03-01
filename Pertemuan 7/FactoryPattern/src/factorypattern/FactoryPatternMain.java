package factorypattern;

/**
 *
 * @author U53R
 */
public class FactoryPatternMain {
    public static void main(String args[]){
        PegawaiFactory factory = new PegawaiFactory();
        System.out.println(factory.buatPegawai("Luthfi", "tetap").toString());
        System.out.println(factory.buatPegawai("Dani", "kontrak").toString());       
    }    
}

