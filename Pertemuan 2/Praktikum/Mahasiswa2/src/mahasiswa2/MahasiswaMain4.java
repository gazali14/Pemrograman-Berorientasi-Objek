package mahasiswa2;

public class MahasiswaMain4 {
    public static void main (String args[]){
        Mahasiswa3 s1 = new Mahasiswa3();
        Mahasiswa3 s2 = new Mahasiswa3();
        
        s1.tambahData(123456, "Luthfi");
        s2.tambahData(123457, "Rahma");
        s1.tampilkanInfo();
        s2.tampilkanInfo();
    }
    
}
