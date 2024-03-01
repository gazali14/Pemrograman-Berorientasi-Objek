package mahasiswa2;

public class Mahasiswa4 {
    int nim;
    String nama;
    
    Mahasiswa4(int vnim, String vnama){
        nim = vnim;
        nama = vnama;
    }
    
    void tampilkanInfo(){
        System.out.println(nim + " " +nama);
    }
}
