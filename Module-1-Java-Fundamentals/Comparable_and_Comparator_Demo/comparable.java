import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book implements Comparable<Book> {
    private final String title;
    private final double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() { return title; }
    public double getPrice() { return price; }

    // Natural ordering: sorts books by price (ascending)
    @Override
    public int compareTo(Book other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return title + " — $" + price;
    }
}

public class comparable{
    public static void main(String[] args) {
        List<Book> catalog = new ArrayList<>();
        catalog.add(new Book("Advanced Java", 45.99));
        catalog.add(new Book("Python Basics", 29.99));
        catalog.add(new Book("Data Structures & Algorithms", 59.50));

        // Collections.sort() automatically uses Book's compareTo() method
        Collections.sort(catalog);

        // Prints the books sorted by price
        catalog.forEach(System.out::println);
    }
}
