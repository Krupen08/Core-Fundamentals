public class Strings {
    public static void main(String[] args) {
        // String Literals -> Stored in String Constant Pool (SCP) inside Heap
        String s1 = "Hello";
        String s2 = "Hello"; // Reuses "Hello" from SCP (s1 == s2 is true)

        // Using 'new' -> Creates new object in Heap memory, bypassing SCP reuse
        String s3 = new String("Hello"); // s1 == s3 is false (different heap references)

        // Basics & SCP Methods
        System.out.println("Length: " + s1.length());                    // 5
        System.out.println("Char at 1: " + s1.charAt(1));                // 'e'
        System.out.println("Substring: " + s1.substring(0, 4));          // "Hell"

        // Modifying strings creates NEW objects (Strings are immutable in SCP)
        System.out.println("Upper: " + s1.toUpperCase());                // "HELLO"
        System.out.println("Replace: " + s1.replace('l', 'x'));          // "Hexxo"

        // .intern() explicitly returns the pool reference from SCP
        String s4 = s3.intern();
        System.out.println("SCP Reference Match: " + (s1 == s4));        // true

        // Value Comparison (Always use .equals for contents, not ==)
        System.out.println("Equals: " + s1.equalsIgnoreCase("hello"));   // true
        System.out.println("Contains: " + s1.contains("ell"));           // true
    }
}