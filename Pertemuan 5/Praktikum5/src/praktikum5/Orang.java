package praktikum5;

/**
 *
 * @author U53R
 */

import java.time.LocalDate;
public abstract class Orang {
    String nama;
    LocalDate tanggalLahir;
    
    public Orang(String nama, LocalDate tanggalLahir){
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    
    public String getNamaPanggilan(){
        if(nama.length() >= 3){
            return nama.substring(0, 3);
        } else {
            return nama;
        }
    }
}
