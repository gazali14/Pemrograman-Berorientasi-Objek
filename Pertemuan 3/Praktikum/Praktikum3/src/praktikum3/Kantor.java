/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author U53R
 */
public class Kantor {
    public static void main(String[] args) {
        Orang lutfi = new Orang();
        lutfi.setNama("Lutfi");
        lutfi.setTanggalLahir(new Date(2001, 1, 20));
        
        Orang rahma = new Orang("Rahma");
        rahma.setTanggalLahir(new Date(1997, 8, 31));
        
        Pegawai tuti =  new Pegawai("6836492379","STIS","IT","Tuti",new Date(1997, 8, 2));
        
        System.out.println("Ada orang:");
        System.out.println(lutfi.getNama()+" lahir pada "+lutfi.getTanggalLahir());
        System.out.println(rahma.getNama()+" lahir pada "+rahma.getTanggalLahir());
        System.out.println(tuti.getNama()+
                " lahir pada "+tuti.getTanggalLahir()+
                " NIP: "+tuti.getNIP()+
                " kantor: "+tuti.getNamaKantor()+
                " bagian: "+tuti.getUnitKerja()
        );
        
        System.out.print("\nGaji Orang Rahma :");rahma.getGaji();
        System.out.print("Gaji Orang Tuti :");tuti.getGaji();
        
        List<Pegawai> daftarPegawai = new ArrayList<Pegawai>();
        daftarPegawai.add(tuti);
        UnitKerja umum = new UnitKerja("Umum", daftarPegawai);
        System.out.println("\n" + umum);
    }
}
