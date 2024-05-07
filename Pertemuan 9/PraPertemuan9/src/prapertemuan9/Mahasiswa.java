package prapertemuan9;

/**
 *
 * @author U53R
 */
public class Mahasiswa {
    private String nim;
    private String namaDepan;
    private String namaBelakang;
    private String umur;
    private String asal;

    public Mahasiswa(String nim, String namaDepan, String namaBelakang, String umur, String asal) {
        this.nim = nim;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.umur = umur;
        this.asal = asal;
    }

    public String getNim() {
        return nim;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public String getUmur() {
        return umur;
    }

    public String getAsal() {
        return asal;
    }   
}
