package day2_Constructor_Method_overloading_variables;

public class MethodOverloading {

    //Creating method with no parameters

    public void method1()
    {
        System.out.println("hi");
    }

    //Creating method with one parameter

    public void method1(int a)
    {
        System.out.println(a);
    }

    //Creating method with two parameters

    public void method1(double a, String b)
    {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        MethodOverloading obj =  new MethodOverloading();
        obj.method1();
        obj.method1(10);
        obj.method1(100.00,"Testing");
    }

}
