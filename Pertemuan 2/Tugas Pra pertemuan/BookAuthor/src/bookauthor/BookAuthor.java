package bookauthor;

/**
 *
 * @author U53R
 */

public class BookAuthor {
    public static void main(String[] args) {
        // Membuat objek Authors
        Author nano = new Author("Nano Yulian P.", "nano@bps.go.id", 'm');
        Author yeni = new Author("Wa Ode Zuhayeni M.", "yeni@bps.go.id", 'f');

        // Membuat array of Authors
        Author[] authors = {nano, yeni};

        // Membuat objek Book dengan menggunakan array of Authors
        Book oopBook = new Book("OOP for dummies", authors, 50000, 100);

        // Mendapatkan informasi buku dan penulis
        System.out.println("Book Info: " + oopBook);
        System.out.println("\nAuthor Names: " + oopBook.getAuthorNames());
    }
}

