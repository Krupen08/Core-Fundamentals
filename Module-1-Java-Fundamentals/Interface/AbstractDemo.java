package AbstractDemo;

abstract class Animal
{
    Animal(int age)
    {
        System.out.println("Inside abstract "+"Animal constructor");
        this.age = age;
    }
    void eat()
    {
        System.out.println("Inside abstract class " + " Animal is eating");
    }

    abstract void sleep();
    int age;

    abstract void printingAge(int age);

}

class Dog extends Animal
{
    Dog(int age)
    {
        super(age);
    }

    @Override
    void sleep()
    {
        System.out.println("Dog is sleeping");
    }

    @Override
    void printingAge(int age)
    {
        System.out.println("Dog is of " + age + " years old");
    }

}

public class AbstractDemo {
	public static void main(String[] args)
    {
        Dog d = new Dog(10);
        d.eat();
        d.sleep();
        d.printingAge(10);
    }
}

