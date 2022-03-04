package day12_MethodOverriding;
//inheriting parent class into child class
public class Child extends Parent
{
    public void behaviour()
    {
        System.out.println("Child Behaviour");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        //child method is overriding parent method
        obj.behaviour();
    }
}
