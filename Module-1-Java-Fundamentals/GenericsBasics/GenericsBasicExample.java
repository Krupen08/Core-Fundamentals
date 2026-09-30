package GenericsBasicExample;
import java.util.ArrayList;
import java.util.List;

// ---------------------------------------------------------
// 1. GENERIC CLASS
// ---------------------------------------------------------
// T is a type parameter.
// The actual type will be decided when we create the object.
//
// Box<String>  -> T becomes String
// Box<Integer> -> T becomes Integer
// ---------------------------------------------------------

class Box<T> {

    private T value;

    Box(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }

    void setValue(T value) {
        this.value = value;
    }
}


// ---------------------------------------------------------
// 2. GENERIC METHOD
// ---------------------------------------------------------
// <T> before the return type declares that this method
// has its own type parameter.
//
// T is NOT coming from the Box class.
// This T belongs only to this method.
// ---------------------------------------------------------

class Utility {

    static <T> void print(T value) {
        System.out.println("Value: " + value);
    }


    // -----------------------------------------------------
    // 3. BOUNDED GENERIC
    // -----------------------------------------------------
    // T must be Number or a subclass of Number.
    //
    // Integer, Double, Float etc. are allowed.
    // String is NOT allowed.
    // -----------------------------------------------------

    static <T extends Number> double square(T value) {

        // Because T extends Number, Java knows that
        // doubleValue() exists.
        return value.doubleValue() * value.doubleValue();
    }


    // -----------------------------------------------------
    // 4. WILDCARD WITH extends
    // -----------------------------------------------------
    // ? extends Number means:
    //
    // "A List containing some unknown type that is
    //  Number or a subclass of Number."
    //
    // Therefore List<Integer>, List<Double>, etc. work.
    //
    // We can READ values as Number.
    // We cannot safely ADD a Number because we don't know
    // the actual type of the list.
    // -----------------------------------------------------

    static void printNumbers(List<? extends Number> numbers) {

        for (Number n : numbers) {
            System.out.println(n);
        }
    }


    // -----------------------------------------------------
    // 5. WILDCARD WITH super
    // -----------------------------------------------------
    // ? super Integer means:
    //
    // "A List whose type is Integer or one of Integer's
    //  superclasses."
    //
    // Possible lists:
    //
    // List<Integer>
    // List<Number>
    // List<Object>
    //
    // We can safely ADD Integer values.
    // -----------------------------------------------------

    static void addNumbers(List<? super Integer> numbers) {

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
    }
}


// ---------------------------------------------------------
// 6. INHERITANCE + GENERICS
// ---------------------------------------------------------

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}


class Dog extends Animal {

    Dog(String name) {
        super(name);
    }
}


class Cat extends Animal {

    Cat(String name) {
        super(name);
    }
}


// ---------------------------------------------------------
// 7. Comparable<T>
// ---------------------------------------------------------
// Comparable itself is a generic interface.
//
// Comparable<Dog> means:
// "Dog can be compared with another Dog."
// ---------------------------------------------------------

class Student implements Comparable<Student> {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {

        // Compare students based on marks.
        return this.marks - other.marks;
    }

    @Override
    public String toString() {
        return name + " : " + marks;
    }
}


// ---------------------------------------------------------
// MAIN CLASS
// ---------------------------------------------------------

public class GenericsBasicExample {

    public static void main(String[] args) {

        // =================================================
        // PART 1: GENERIC CLASS
        // =================================================

        // Here T becomes String.
        Box<String> stringBox = new Box<>("Hello");

        // getValue() therefore returns String directly.
        String text = stringBox.getValue();

        System.out.println("String box: " + text);


        // Here T becomes Integer.
        Box<Integer> integerBox = new Box<>(100);

        // getValue() returns Integer.
        Integer number = integerBox.getValue();

        System.out.println("Integer box: " + number);


        // This would NOT compile:
        //
        // stringBox.setValue(100);
        //
        // because stringBox is Box<String>.
        //
        // Generics prevent this mistake at compile time.


        // =================================================
        // PART 2: GENERIC METHOD
        // =================================================

        // Java infers:
        //
        // T = String
        //
        Utility.print("Hello");

        // Here:
        //
        // T = Integer
        //
        Utility.print(100);

        // Here:
        //
        // T = Double
        //
        Utility.print(10.5);


        // =================================================
        // PART 3: BOUNDED GENERIC
        // =================================================

        // Integer extends Number -> allowed.
        double result1 = Utility.square(5);

        // Double extends Number -> allowed.
        double result2 = Utility.square(2.5);

        System.out.println("Square of 5: " + result1);
        System.out.println("Square of 2.5: " + result2);


        // This would NOT compile:
        //
        // Utility.square("Hello");
        //
        // because String does not extend Number.


        // =================================================
        // PART 4: ? extends
        // =================================================

        List<Integer> integers = new ArrayList<>();

        integers.add(10);
        integers.add(20);
        integers.add(30);

        // List<Integer> can be passed to:
        //
        // List<? extends Number>
        //
        // because Integer extends Number.

        Utility.printNumbers(integers);


        List<Double> doubles = new ArrayList<>();

        doubles.add(1.5);
        doubles.add(2.5);

        // List<Double> also works because
        // Double extends Number.

        Utility.printNumbers(doubles);


        // =================================================
        // PART 5: ? super
        // =================================================

        List<Number> numbers = new ArrayList<>();

        // List<Number> matches:
        //
        // List<? super Integer>
        //
        // because Number is a superclass of Integer.

        Utility.addNumbers(numbers);

        System.out.println("Numbers: " + numbers);


        // =================================================
        // PART 6: GENERICS + INHERITANCE
        // =================================================

        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("Bruno"));
        dogs.add(new Dog("Rocky"));

        // Dog extends Animal.
        //
        // Therefore:
        //
        // List<Dog>
        // can be used as
        // List<? extends Animal>
        //
        // This allows us to READ the elements as Animals.

        printAnimals(dogs);


        // =================================================
        // PART 7: Comparable<Student>
        // =================================================

        Student s1 = new Student("Krupen", 85);
        Student s2 = new Student("Rahul", 70);

        // Comparable<Student> makes compareTo()
        // accept Student rather than Object.

        int result = s1.compareTo(s2);

        if (result > 0) {
            System.out.println(s1.name + " has higher marks.");
        }
        else if (result < 0) {
            System.out.println(s2.name + " has higher marks.");
        }
        else {
            System.out.println("Both have the same marks.");
        }
    }


    // -----------------------------------------------------
    // Helper method demonstrating ? extends Animal
    // -----------------------------------------------------

    static void printAnimals(List<? extends Animal> animals) {

        for (Animal animal : animals) {

            // We know that whatever the actual type is,
            // it must extend Animal.
            //
            // Therefore we can safely treat each element
            // as an Animal.

            System.out.println("Animal: " + animal);
        }
    }
}