package orang;

/**
 *
 * @author U53R
 */
import java.util.Date;
abstract class Orang {
    String nama;
    Date tangglLahir;
    
    public Orang(){        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTangglLahir() {
        return tangglLahir;
    }

    public void setTangglLahir(Date tangglLahir) {
        this.tangglLahir = tangglLahir;
    }
    
    public abstract String getAlamat();
    public abstract void setAlamat(String alamat);
}
