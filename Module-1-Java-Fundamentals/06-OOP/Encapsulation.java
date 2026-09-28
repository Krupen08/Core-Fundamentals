// Non-public class in the same file
class Student {
    // Private fields hidden from outside access
    private String name;
    private int age;

    // Public Getter & Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Public Getter & Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

// Public class matching the file name (Main.java)
public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        // Set data safely via setters
        s.setName("Krupen");
        s.setAge(20);

        // Access data safely via getters
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}