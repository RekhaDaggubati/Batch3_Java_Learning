package day3_thiskeyword_returnstatement;

public class ConstructorThis {
//Zero constructor
    ConstructorThis()
    {

        System.out.println("It is zero constructor");
    }
//one parameter constructor
    ConstructorThis(int a)
    {
        this();
        System.out.println(a);
    }
//two parameter constructor
    ConstructorThis(String c, boolean b)
    {
        this(5);
        System.out.println(c);
        System.out.println(b);

    }
//three parameter constructor
    ConstructorThis(char a,int b, String d)
    {
        this("rekha", false);
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
    }
    public static void main(String[] args) {
        ConstructorThis obj = new ConstructorThis('a',20,"hello");
    }

}




