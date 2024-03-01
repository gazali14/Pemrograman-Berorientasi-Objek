package orang;
/**
 *
 * @author U53R
 */
public class OrangTest {
    public static void main(String[] args) {
        //Orang o = new Orang(); error karena abstract class tidak bisa dibuat objek
        Pegawai luthfi = new Pegawai();
        luthfi.setAlamat("Otista 64 C");
        System.out.println(luthfi.getAlamat());
        
        luthfi.setNIDN("12345678");
        luthfi.setKelompokKeahlian("Computer Science");
        System.out.println("ada dosen Luthfi dengan NIDN "+luthfi.getNIDN()+
                ", Kelompok "+luthfi.getKelompokKeahlian());
    }
}
