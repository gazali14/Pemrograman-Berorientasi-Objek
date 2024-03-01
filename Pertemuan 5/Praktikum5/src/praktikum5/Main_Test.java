package praktikum5;

/**
 *
 * @author U53R
 */
import java.time.LocalDate;
public class Main_Test {
    public static void main (String args []){
        Pegawai findry = new Pegawai(
                "Findry",LocalDate.of(2024, 12, 01),"111222","Polstat STIS",
                "UPK","00367","Analisis");

        System.out.println(
                "Object Pegawai:\nNama: " +findry.getNama() +
                        "\nNama Panggilan: " +findry.getNamaPanggilan() +
                        "\nNIP:" +findry.getNIP() +
                        "\nKantor: " +findry.getKantor() +
                        "\nPekerjaan: " +findry.getPekerjaan() +
                        "\nNIDN: " +findry.getNIDN() +
                        "\nKeahlian: " +findry.getKeahlian()
        );

        Programmer gazali = new Programmer(
                "gazali",LocalDate.of(2024, 10, 07),"222111", "Polstat STIS",
                "UPK","030607","Ngoding","Java","Mobile");

        System.out.println(
                "\nObject Programmer:"+ 
                        "\nNama: " +gazali.getNama() +
                        "\nNama Panggilan: " +gazali.getNamaPanggilan() +
                        "\nNIP:" +gazali.getNIP() +
                        "\nKantor: " +gazali.getKantor() +
                        "\nPekerjaan: " +gazali.getPekerjaan() +
                        "\nBahasa Pemrograman: " +gazali.getBahasaPemrograman() +
                        "\nPlatform: " +gazali.getPlatform()
        );
    }
}
