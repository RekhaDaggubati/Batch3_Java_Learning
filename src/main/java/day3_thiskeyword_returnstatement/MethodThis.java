package day3_thiskeyword_returnstatement;

public class MethodThis {

    //Creating method with no parameters

    public void method1()
    {
        System.out.println("hi");
    }

    //Creating method with one parameter

    public void method1(int a)
    {
        this.method1();
        System.out.println(a);
    }

    //Creating method with two parameters

    public void method1(double a, String b)
    {
        this.method1(10);
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        MethodThis obj =  new MethodThis();
        obj.method1(100.00,"Testing");
    }

}

