
package inter;

/**
 *
 * @author U53R
 */
interface Inter{}
class One {
    public void print(int i) { // Mengubah menjadi non-statis
        System.out.println("Parent");
    }
}

class Two extends One {
    public void print(int i) { // Override metode print dari kelas One
        System.out.println("Child");
    }
}

class Test {
    public static void main(String[] args) {
        One one = new Two(); // Membuat objek dari kelas Two
        one.print(10); // Memanggil metode print melalui objek one
    }
}
