package praktikum5;

import java.time.LocalDate;

/**
 *
 * @author U53R
 */
public class Pegawai extends Orang implements Dosen{
    private String NIP;
    private String Kantor;
    private String unitKerja;
    String NIDN;
    String keahlian;

    public Pegawai(String nama, LocalDate tanggalLahir,String NIP, String Kantor, 
                    String unitKerja, String NIDN, String keahlian) {
        super(nama, tanggalLahir);
        this.NIP = NIP;
        this.Kantor = Kantor;
        this.unitKerja = unitKerja;
        this.NIDN = NIDN;
        this.keahlian = keahlian;
    }
                    
    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getKantor() {
        return Kantor;
    }

    public void setKantor(String Kantor) {
        this.Kantor = Kantor;
    }
    
    @Override
    public String getNIDN(){
        return NIDN;
    }
    
    @Override
    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }
    
    @Override
    public String getKeahlian(){
        return keahlian;
    }    
    
    @Override
    public void setKeahlian(String Keahlian){
        keahlian = Keahlian;
    }

    @Override
    public String getPekerjaan() {
        return "Mengajar";
    }
}
