class Cloneable_Interface implements Cloneable {
    String name;
    int age;
    Cloneable_Interface(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
    public static void main(String[] args) {
        try {
            Cloneable_Interface original = new Cloneable_Interface("Alice", 30);
            Cloneable_Interface cloned = (Cloneable_Interface) original.clone();

            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}