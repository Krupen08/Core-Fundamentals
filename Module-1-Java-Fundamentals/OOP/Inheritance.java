// Parent class (Superclass)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (Subclass) inheriting from Animal using 'extends'
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Dog uses method inherited from Animal class
        myDog.eat();  // Output: This animal eats food.

        // Dog uses its own method
        myDog.bark(); // Output: The dog barks.
    }
}