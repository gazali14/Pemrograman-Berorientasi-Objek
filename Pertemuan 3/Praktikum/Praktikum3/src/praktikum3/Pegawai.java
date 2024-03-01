package praktikum3;

import java.util.Date;


/**
 *
 * @author U53R
 */
public class Pegawai extends Orang {
    private String NIP;
    private String namaKantor;
    private String unitKerja;
    private String gaji;

    public Pegawai() {
    }

    public Pegawai(String NIP, String namaKantor, String unitKerja) {
        this.NIP = NIP;
        this.namaKantor = namaKantor;
        this.unitKerja = unitKerja;
    }

    public Pegawai(String NIP, String namaKantor, String unitKerja, String nama, Date tanggalLahir) {
        super(nama, tanggalLahir);
        this.NIP = NIP;
        this.namaKantor = namaKantor;
        this.unitKerja = unitKerja;
    }
    
    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNamaKantor() {
        return namaKantor;
    }

    public void setNamaKantor(String namaKantor) {
        this.namaKantor = namaKantor;
    }

    public String getUnitKerja() {
        return unitKerja;
    }

    public void setUnitKerja(String unitKerja) {
        this.unitKerja = unitKerja;
    }
    
    public void getGaji() {
        System.out.println("7 juta");
    }    
}
