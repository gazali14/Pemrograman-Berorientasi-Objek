package latihan.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author U53R
 */
public class LatihanFile {
    public static void main(String[] args) {
        try {
            File f = new File("D:\\POLSTAT STIS\\Semester 4\\Pemrograman Objek\\Pertemuan 10\\objek.dat");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Mahasiswa mhs = (Mahasiswa) ois.readObject();
            System.out.println(mhs.getNim());
            System.out.println(mhs.getNama());
            ois.close();
            fis.close();
            } catch (FileNotFoundException ex) {
                System.err.println("File tidak ditemukan");
            } catch (IOException ex) {
                System.err.println("File gagal dibaca");
            } catch (ClassNotFoundException ex) {
                System.err.println("Format File salah");
            }
    }
}