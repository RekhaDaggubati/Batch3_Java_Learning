package practicing_Java;

public class ConstructorOverloading
{
    //Creating Instance Variables
    int a;
    int b;
    //Creating Zero Parameter Constructor
    ConstructorOverloading()
    {
        System.out.println("This is Zero Parameter Constructor");
    }
    //Creating one Parameter Constructor
    ConstructorOverloading(int a){
        this.a =a;
        System.out.println("One Parameter Constructor: "+a);
    }
    //Creating Two Parameter Constructor
    ConstructorOverloading(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Two Parameter Constructor: "+a);
        System.out.println("Two Parameter Constructor: "+b);
    }
    //main method
    public static void main(String[] args)
    {
        ConstructorOverloading obj = new ConstructorOverloading();
        ConstructorOverloading obj1 = new ConstructorOverloading(10);
        ConstructorOverloading obj2 = new ConstructorOverloading(20,30);
    }
}
