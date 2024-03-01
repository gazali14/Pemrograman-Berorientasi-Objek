package bookauthor;

/**
 *
 * @author U53R
 */

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder authorString = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            authorString.append("  ").append(authors[i]);
            if (i < authors.length - 1) {
                authorString.append("\n");
            }
        }

        return "[\n" +
               "  name = " + name + "\n" +
               "  price = " + price + "\n" +
               "  qty = " + qty + "\n" +
               "  authors :" + authorString + "\n" +
               "]";
    }

    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            authorNames.append(authors[i].getName());
            if (i < authors.length - 1) {
                authorNames.append(", ");
            }
        }
        return authorNames.toString();
    }
}
