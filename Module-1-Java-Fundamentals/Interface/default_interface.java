public class default_interface
{
    static void main(String[] args)
    {
        Vehicle v = new Car();
        v.drive();
        Vehicle.brake(); // invoked using static method
    }
}

interface Vehicle
{
    // Here the default keyword is used to make the definition of the method inside the interface directly
    // Before java 8 this was not possible to use
    // if we write normal method lke void show then this method is public/abstract by own so defining a method is not
    // possible without default keyword....
    // You can override the drive() method in the class which implements the interface.
    default void drive()
    {
        System.out.println("invoked from interface");
    }

    //Static method can also be implemented after Java 8
    static void brake()
    {
        System.out.println("Applying brake");
    }

    //Private method
    // invoked from the interface only
    // like some methods are invoking accelerate();
    private void accelerate()
    {
        System.out.println("Vehicle is accelerating...");
    }
}
class Car implements Vehicle
{
    // even if we dont write override then it is by default overriding it.
    // the method signature should be public because the interface definition is public by defualt
    @Override
    public void drive()
    {
        System.out.println("Inside the class which override the method");
    }

}
