package day3_thiskeyword_returnstatement;

public class ConstructorThis_1 {

 //Zero constructor
 ConstructorThis_1()
    {
        this(10);
        System.out.println("It is zero constructor");
    }
    //one parameter constructor
    ConstructorThis_1(int a)
    {
        this("hi", true);
        System.out.println(a);
    }
    //two parameter constructor
    ConstructorThis_1(String c, boolean b)
    {
        this('a',10,"welcome");
        System.out.println(c);
        System.out.println(b);

    }
    //three parameter constructor
    ConstructorThis_1(char a,int b, String d)
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);

    }
    public static void main(String[] args)
    {
        ConstructorThis_1 obj = new ConstructorThis_1();
    }

}

