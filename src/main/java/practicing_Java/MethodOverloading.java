package practicing_Java;

public class MethodOverloading
{
    //instance variables
    int a;
    int b;
    //creating zero parameter method
    public void method()
    {
        System.out.println("Zero Parameter Method");
    }
    //creating one parameter method
    public void method(int a)
    {
        this.a =a;
        System.out.println("One Parameter Method: "+a);
    }
    //creating two parameter method
    public void method(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Two parameter Method: "+a);
        System.out.println("Two Parameter Method: "+b);
    }
    //main method
    public static void main(String[] args)
    {
        MethodOverloading obj = new MethodOverloading();
        obj.method();
        obj.method(10);
        obj.method(20,30);
    }
}
