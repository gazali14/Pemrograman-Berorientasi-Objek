package praktikum3;

import java.util.Date;

/**
 *
 * @author U53R 
 */
public class Orang {
    private String nama;
    private Date tanggalLahir;
    private String gaji;

    public Orang() {
    }

    public Orang(String nama) {
        this.nama = nama;
    }

    public Orang(String nama, Date tanggalLahir) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    public void getGaji() {
        System.out.println("tidak ada");
    }
    
}

