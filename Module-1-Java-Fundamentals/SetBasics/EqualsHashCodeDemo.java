package EqualsHashCodeDemo;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqualsHashCodeDemo {

    static class BadBook {
        String title;

        BadBook(String title) {
            this.title = title;
        }
    }

    static class GoodBook {
        String title;

        GoodBook(String title) {
            this.title = title;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof GoodBook)) return false;
            GoodBook other = (GoodBook) o;
            return Objects.equals(title, other.title);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title);
        }
    }

    public static void main(String[] args) {

        // 1. No equals/hashCode: default identity comparison, so "duplicates" get in
        Set<BadBook> bad = new HashSet<>();
        bad.add(new BadBook("Java"));
        bad.add(new BadBook("Java"));
        System.out.println("1. BadBook set size:  " + bad.size());   // 2

        // 2. Proper equals + hashCode: duplicates are detected
        Set<GoodBook> good = new HashSet<>();
        good.add(new GoodBook("Java"));
        good.add(new GoodBook("Java"));
        System.out.println("2. GoodBook set size: " + good.size());  // 1

        // 3. Mutating an element AFTER inserting it breaks the set
        GoodBook book = new GoodBook("Old Title");
        Set<GoodBook> shelf = new HashSet<>();
        shelf.add(book);
        book.title = "New Title";                                    // hashCode changed!
        System.out.println("3a. contains: " + shelf.contains(book)); // false
        System.out.println("3b. removed:  " + shelf.remove(book));   // false
        System.out.println("3c. size:     " + shelf.size());         // 1, a "ghost" entry
    }
}