package praktikum3;

import java.util.List;

/**
 *
 * @author U53R
 */
public class UnitKerja {
    private String nama;
    private List<Pegawai> daftarPegawai;

    public UnitKerja(String nama, List<Pegawai> daftarPegawai) {
        this.nama = nama;
        this.daftarPegawai = daftarPegawai;
    }

    public String getNama() {
        return nama;
    }

    public List<Pegawai> getDaftarPegawai() {
        return daftarPegawai;
    }
    
    @Override
    public String toString() {
        return "UnitKerja{" + "nama=" + nama + ", daftarPegawai=" + daftarPegawai + '}';
    }    
}