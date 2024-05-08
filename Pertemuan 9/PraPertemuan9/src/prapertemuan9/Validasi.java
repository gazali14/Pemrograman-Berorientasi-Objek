package prapertemuan9;

/**
 *
 * @author Gazali
 */

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Validasi {
    private MahasiswaView view;
    private ArrayList<Mahasiswa> listModel = new ArrayList<>();
    
    public String simpan(String nim, String namaDepan, String namaBelakang, String umur, String asal){
        String hasil = "";
        if (nim.length()!=6){
            hasil += "Nim harus memiliki panjang 6 digit \n";
        }
        if (namaDepan.length() + namaBelakang.length()>50){
            hasil += "Panjang maksimal nama depan + nama belakang adalah 50 karakter";
        }
        if (!Pattern.matches("[0-9]+", umur)){
            hasil += "Umur hanya bisa diisi angka \n";
        }
        if (nim.length()==0||namaDepan.length()==0||namaBelakang.length()==0||umur.length()==0|| asal==""){
            hasil += "Semua isian wajib terisi \n";
        }
        if (hasil.length()==0){
            listModel.add(new Mahasiswa(nim, namaDepan, namaBelakang, umur, asal));
            int i = 0;
            hasil += "Daftar NIM dan Nama Mahasiswa yang telah berhasil disimpan : \n";
            for(Mahasiswa m:listModel){
                i++;
                hasil += i + "." + m.getNim() + "-" + m.getNamaDepan() + " " + m.getNamaBelakang() + "\n";
            }
            return hasil;
        }
        else{
            String keterangan = "Terjadi kesalahan: \n";
            return keterangan + hasil;
        }
    }
}
