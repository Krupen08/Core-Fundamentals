// Parent class
class Shape {
    void draw() {
        System.out.println("Drawing a generic shape.");
    }
}

// Subclass 1 overriding draw()
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Subclass 2 overriding draw()
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphism: Parent type references pointing to child objects
        Shape myCircle = new Circle();
        Shape myTriangle = new Triangle();

        // Same method call, but produces different output based on the object type
        myCircle.draw();   // Output: Drawing a Circle.
        myTriangle.draw(); // Output: Drawing a Triangle.
    }
}