package praktikum5;
/**
 *
 * @author U53R
 */
import java.time.LocalDate;
public class Programmer extends Pegawai{
    private String bahasaPemrograman;
    private String platform;

    public Programmer(String nama, LocalDate tanggalLahir, String bahasaPemrograman, String platform,
            String NIP, String Kantor, String unitKerja, String NIDN, String keahlian) {
        super(nama, tanggalLahir,NIP, Kantor, unitKerja, NIDN, keahlian);
        this.bahasaPemrograman = bahasaPemrograman;
        this.platform = platform;
    }

    public String getBahasaPemrograman() {
        return bahasaPemrograman;
    }

    public void setBahasaPemrograman(String bahasaPemrograman) {
        this.bahasaPemrograman = bahasaPemrograman;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    @Override
    public String getPekerjaan(){
        return "Coding all day long";
    }
}
