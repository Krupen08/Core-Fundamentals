//A functional interface has exactly ONE abstract method.
//It is mainly used when you want to pass behavior as data, usually with a lambda expression.
public class Functional_Interface
{
    static void main(String[] args)
    {
        Operation add = (a,b) -> a+b;  // Here lambda function is used for single method
        Operation mul = (a,b) -> a*b;
        System.out.println(add.caluculate(10,20));
        System.out.println(mul.caluculate(10,20));

    }
}

//When?
//When you need to pass a small piece of logic/method to another method.
@FunctionalInterface
interface Operation
{
    int caluculate(int a ,int b);

}
