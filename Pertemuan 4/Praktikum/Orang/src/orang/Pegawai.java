package orang;

/**
 *
 * @author U53R
 */
public class Pegawai extends Orang implements Dosen {
    private String NIP;
    private String namaKantor;
    private String unitKerja;
    private String gaji;
    private String alamat;
    String NIDN;
    String keahlian;
            
    public Pegawai() {
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
    
    @Override
    public String getAlamat(){
        return alamat;
    }
    
    @Override
    public void setAlamat(String alamat){
        this.alamat = alamat;
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
    public String getKelompokKeahlian(){
        return keahlian;
    }    
    
    @Override
    public void setKelompokKeahlian(String kelompokKeahlian){
        keahlian = kelompokKeahlian;
    }   
}