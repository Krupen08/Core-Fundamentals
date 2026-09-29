import java.util.*;

class Manga {
    String title;
    double price;

    Manga(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return title + " - " + price;
    }
}

public class Comparator_example{
    public static void main(String[] args) {

        List<Manga> books = new ArrayList<>();

        books.add(new Manga("Java", 500));
        books.add(new Manga("Python", 300));
        books.add(new Manga("Linux", 400));
        books.add(new Manga("Git", 200));

        // Comparator: price ke according sort
        Comparator<Manga> byPrice =
                (a, b) -> Double.compare(a.price, b.price);
        Comparator<Manga> byTitle = (a,b) -> a.title.compareTo(b.title);

        books.sort(byPrice);
        System.out.println("By Price:");
        for (Manga manga : books) {
            System.out.println(manga);
        }
        System.out.println("\nBy Title:");
        books.sort(byTitle);
        for (Manga book : books) {
            System.out.println(book);
        }
    }
}