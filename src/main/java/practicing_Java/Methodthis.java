package practicing_Java;

public class Methodthis
{
    //instance variables
    int a;
    int b;
    //creating zero parameter method
    public void method()
    {
        //using this keyword to call one parameter method
        this.method(10);
        System.out.println("Zero Parameter Method");
    }
    //creating one parameter method
    public void method(int a)
    {
        //using this keyword to call two parameter method
        this.method(20,30);
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
        Methodthis obj = new Methodthis();
        obj.method();
    }
}
