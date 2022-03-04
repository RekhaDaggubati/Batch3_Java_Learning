package day9_multipleInheritanceConcepts;

public class Car implements Vehicle,Register
{
    public void name() {
        System.out.println("Tesla");
    }

    public void registration() {
        System.out.println("Registration in Colorado");
    }

    public static void main(String[] args) {
        Register obj = new Car();
        obj.registration();
        Vehicle obj1 = new Car();
        obj1.name();
    }

}
