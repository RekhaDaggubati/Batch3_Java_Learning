package day2_Constructor_Method_overloading_variables;

public class ConstructorOverloading {

    //Creating instance variable

    int a=10;
    int b=20;
    String c="hello";

//Creating Zero Constructor

    ConstructorOverloading()
{
    System.out.println("It is Zero Constructor");
}

//Creating one Parameter constructor

    ConstructorOverloading(int a)
    {
        System.out.println(a);
    }

 //Creating two parameter constructor

    ConstructorOverloading(int a, int b)
    {
        System.out.println(a);
        System.out.println(b);

    }
 //Creating three parameter constructor

    ConstructorOverloading(int a, boolean b, String c)
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {

        ConstructorOverloading obj = new ConstructorOverloading();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        ConstructorOverloading obj1 = new ConstructorOverloading(40);
        ConstructorOverloading obj2 = new ConstructorOverloading(50,60);
        ConstructorOverloading obj3 = new ConstructorOverloading(70,true,"hello");

    }


}
