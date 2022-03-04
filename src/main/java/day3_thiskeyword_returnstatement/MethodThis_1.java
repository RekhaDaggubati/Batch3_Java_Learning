package day3_thiskeyword_returnstatement;

public class MethodThis_1 {

    //Creating method with no parameters

    public void method1()
    {
        this.method1(10);
        System.out.println("Zero Method");

    }

    //Creating method with one parameter

    public void method1(int a)
    {
        this.method1(100.00,"testing");
        System.out.println(a);

    }

    //Creating method with two parameters

    public void method1(double b, String c)
    {

        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        MethodThis_1 obj =  new MethodThis_1();
        obj.method1();
    }

}


