package account;

/**
 *
 * @author U53R
 */

public class Main_Account {
    public static void main(String[] args)
    {
        Account Gazali = new Account("001","Gazali",5000);
        Account Heri = new Account("002","Heri",1000);
        System.out.println("Informasi Akun Sebelum Transfer");
        System.out.println(Gazali.toString());
        System.out.println(Heri.toString());
        
        Gazali.transferTo(Heri, 2000);
        System.out.println("\nInformasi Akun Setelah Transfer 2000");
        System.out.println(Gazali.toString());
        System.out.println(Heri.toString());

    }
}