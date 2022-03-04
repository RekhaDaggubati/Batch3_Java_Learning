package practicing_Java;

public class Constructorthis {

    //Creating Instance Variables
    int a;
    int b;

    //Creating Zero Parameter Constructor
    Constructorthis() {
        System.out.println("This is Zero Parameter Constructor");
    }

    //Creating one Parameter Constructor
    Constructorthis(int a)
    {
        //using this keyword to call Zero Constructor
        this();
        this.a = a;
        System.out.println("One Parameter Constructor: " + a);
    }

    //Creating Two Parameter Constructor
    Constructorthis(int a, int b)
    {
        //using this keyword to call one parameter constructor
        this(a);
        this.a = a;
        this.b = b;
        System.out.println("Two Parameter Constructor: " + a);
        System.out.println("Two Parameter Constructor: " + b);
    }

    //main method
    public static void main(String[] args)
    {
        Constructorthis obj2 = new Constructorthis(20,30);
    }
}
