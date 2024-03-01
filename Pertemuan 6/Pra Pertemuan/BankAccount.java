import java.util.ArrayList; // import the ArrayList class
import java.util.Random;
class Person {
    // variables
    private String nama;
    private int umur;
    // array list akun bank (aggregation)
    private ArrayList<BankAccount> akunBank = new ArrayList<>();
    
    //constructor
    public Person (String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        System.out.println("Objek Person " + nama + " Tercipta!!!");
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
    
    // membuka akun bank baru untuk objek person 
    public void bukaAkunBank (String namaBank,String kodeBank,double setoranAwal) {
        akunBank.add(new BankAccount(namaBank, kodeBank, setoranAwal, this.nama));
        System.out.println(this.nama+ " ( Berhasil!!, Membuka Akun Bank " + namaBank + " Saldo awal : " + setoranAwal);
    }
        
    /**
     * mengembalikan akunBank dari objek person berdasarkan parameter noRekening.
     * @param noRekening (String)
     * @return Akun Bank (BankAccount)
     */
    public BankAccount getAkunBank(String noRekening){
        int idxAkun = 0;
        for (BankAccount akun:this.akunBank) {
            if (akun.getNoRek().equals(noRekening)) {
                    return this.akunBank.get(idxAkun);                
            }
            idxAkun++;
        }
        return null;
    }
    
    /**
     * Menampilkan daftar akun bank berupa no rekening dan nama bank dan saldo dari objek person.
     * ====== Daftar Rekening Bank [NAMA Objek Person] ========
     * 1. [BRI] [12312313] [Rp. xxxxx]
     * 2. [BCA] [********] [Rp. xxxxx]
     * 3.  ...
    */
    public void tampilListRekeningBank() {
        System.out.println("====== Daftar Rekening Bank " + this.nama+ " ========");
        // TO DO
        //============================================================================
        // TAMBAHKAN KODE DISINI !!!
        int index = 1;
        for(BankAccount akun: akunBank){
            System.out.println(index + ". [" + akun.getBank() + "] [" + akun.getNoRek() +"] [Rp. "+String.format("%.2f",akun.getSaldo()) +"]");
            index++;
        }
        //==========================================================================
        System.out.println("================================================ ");
    }
    
    /**
     * menghitung dan mengembalikan semua total saldo dari semua akunbank yg dimiliki objek person
     * @return rekapSaldo  
     */
    public double rekapSaldoRekening() {
        double rekapSaldo = 0;
        // TO DO
        //==============================================================================
        // TAMBAHKAN KODE DISINI
        //==============================================================================
        for(BankAccount akun : akunBank){
            rekapSaldo += akun.getSaldo(); //akan menghitung jumlah saldo keseluruhan
        }
        System.out.println("Total Saldo Semua Rekening "+this.nama+ " : Rp." + String.format("%.2f",rekapSaldo));
        return rekapSaldo;
    }
}

/**
 * Class Bank
 * @author nanoy
 */
class Bank {
    public String namaBank;
    public String kodeBank;
    
    /** 
     * mengenerate dan mengembalikan nomor rekening bank .
     * panjang no.rekening HARUS 9 digit : (kode bank 3 digit + 6 digit).
     * 
     * @return nomorRekening dengan panjang 9 digit (String)
    */     
    public String generateNoRek() {
        // TODO
        //=========================================================
        // TAMBAHKAN KODE DISINI !!!
        //=========================================================
        Random random = new Random();
        int randomNumber = random.nextInt(900000) + 100000; // generate angka random 6-digit
        String noRek = String.format("%03d", Integer.parseInt(kodeBank)) + String.format("%06d", randomNumber); // concatenate bank code dan random number
        return noRek; // ubah returnnya
    }
}

/**
 * interface transaksi keuangan
 */
interface ITransaksi {
    public void tarikSaldo(double jumlahUang);
    public void setor(double jumlahUang);
    public void transfer(double jumlahUang, Person p, String noRek);
    
}

/**
 * BankAccount Class 
 */
public class BankAccount implements ITransaksi {
    // composition
    private Bank bank;
    private String noRek; 
    private double saldo;
    // constructor
    public BankAccount(String namaBank, String kodeBank, double depositAwal,String namaNasabah) {
        this.bank = new Bank();
        this.bank.kodeBank = kodeBank;
        this.bank.namaBank = namaBank;
        this.noRek = this.bank.generateNoRek();
        this.saldo = depositAwal;        
    }

    /**
     * method tarikSaldo, jumlah uang pada akun bank bersangkutan akan berkurang
     * @param jumlahUang 
     */
    @Override
    public void tarikSaldo(double jumlahUang) {
        // TODO
        //=============================
        // TAMBAHKAN KODE DISINI !!!
        if (saldo >= jumlahUang) {
            saldo -= jumlahUang;  //saat saldo ditarik, maka saldo akan berkurang sebanyak jumlahUang yang ditarik
            System.out.println("Penarikan berhasil. Sisa saldo : Rp." + String.format("%.2f",saldo));
        }else{
            System.out.println("Saldo tidak mecukupi untuk melakukan penarikan sebesar Rp." + String.format("%.2f",jumlahUang));
        }
        //=============================
    }

    /**
     * method setor, jumlah uang pada akun bank bersangkutan akan bertambah
     * @param jumlahUang 
     */
    @Override
    public void setor(double jumlahUang) {
        // TO DO
        //===========================================
        // TAMBAHKAN KODE DISINI !!
        //===========================================
        saldo += jumlahUang; //saat menyetorkan sejumlah uang ke rekening, maka saldo akan bertambah sebanyak jumlahUang yang disetorkan
        System.out.println("Berhasil setor ke rekening sejumlah : Rp." +  String.format("%.2f",jumlahUang));
    }
    
    /**
     * Method transfer, saldo akunbank pengirim akan berkurang dan saldo akunbank penerima akan bertambah
     * sesuai jumlah uang yang ditransfer pada parameter.
     * @param jumlahUang
     * @param penerima
     * @param noRek 
     */
    @Override
    public void transfer(double jumlahUang,Person penerima, String noRek) {
        // TO DO
        // =====================================================
        // TAMBAHKAN KODE DISINI !!!
        // =====================================================
        if (saldo >= jumlahUang) {
            saldo -= jumlahUang;
            penerima.getAkunBank(noRek).setor(jumlahUang);
            System.out.println("Transfer berhasil ke "+noRek+" a.n. "+penerima.getNama()+
                        " sebesar Rp. "+ String.format("%.2f",jumlahUang));    
        }else{
            System.out.println("Saldo tidak mencukupi untuk melakukan transfer sebesar Rp." +String.format("%.2f",jumlahUang));
        }
        
    }
    
    public String getBank() {
        return bank.namaBank;
    }

    public String getNoRek() {
        return noRek;
    }

    public double getSaldo() {
        return saldo;
    }
}
