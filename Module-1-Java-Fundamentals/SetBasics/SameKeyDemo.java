package SameKeyDemo;
import java.util.HashMap;
import java.util.Map;

public class SameKeyDemo {

    public static void main(String[] args) {
        Map<Object, String> map = new HashMap<>();

        map.put(new CompanyKey("Motadata"), "Ahmedabad");
        map.put(new CompanyKey("Motadata"), "Gandhinagar");
        map.put(new CompanyKey("Motadata"), "Surat");
        map.put(new CompanyKey("Motadata"), "Vadodara");
        map.put(new CompanyKey("Motadata"), "Rajkot");

        for (Map.Entry<Object, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    static class CompanyKey {
        private final String name;

        CompanyKey(String name) {
            this.name = name;
        }

        // equals() is NOT overridden, so every CompanyKey object is a different key.

        @Override
        public int hashCode() {
            return name.hashCode();
        }

        // Called automatically when the key is printed or concatenated to a String
        @Override
        public String toString() {
            return name;
        }
    }
}