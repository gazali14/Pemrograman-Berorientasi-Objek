package mahasiswa2;

public class Mahasiswa3 {
    int nim;
    String nama;
    
    void tambahData(int vnim, String vnama){
        nim = vnim;
        nama = vnama;
    }
    
    void tampilkanInfo(){
        System.out.println(nim + " " +nama);
    }
}
