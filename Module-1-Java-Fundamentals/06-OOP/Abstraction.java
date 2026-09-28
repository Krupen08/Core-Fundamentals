// Abstract class defines the blueprint (hides implementation details)
abstract class Janwar {
    // Abstract method has no body
    public abstract void makeSound();

    // Regular method inside abstract class
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass provides implementation for the abstract method
class dog extends Janwar {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Animal a = new Animal(); // ERROR: Cannot instantiate abstract class directly

        Janwar myDog = new dog();
        myDog.makeSound(); // Output: Woof! Woof!
        myDog.sleep();     // Output: Sleeping...
    }
}