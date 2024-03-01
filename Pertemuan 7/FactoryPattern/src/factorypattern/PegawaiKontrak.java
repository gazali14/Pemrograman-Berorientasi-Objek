package factorypattern;

/**
 *
 * @author U53R
 */
public class PegawaiKontrak extends Pegawai {
    public PegawaiKontrak(String nama){
        setNama(nama);
        setTipe("Kontrak");
        setPembayarangaji("Perjam");
    }
}

