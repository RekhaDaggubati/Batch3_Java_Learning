package day8_JavaEight_Lambda_Concepts;
//using @FunctionalInterface to avoid of another abstract methods
@FunctionalInterface
//creating Interface
interface Addition{
    //creating abstract method
    public int add(int a,int b);
}
//creating class
public class LambdaAddition {
    public static void main(String[] args)
    {
        //creating object to retrieving abstract method
//using lambda expression
        //single statement there is no use of return statement and curly braces
        //Addition obj = (x,y) -> x+y;
       //int d =  obj.add(5,6);
        //System.out.println("Addition of x and y is " + d);
        //System.out.println(obj.add(3,4));
 //Using multiple statements then we use return statement and curly braces
    Addition obj = (x,y) -> {
        System.out.println("First number is: "+x);
        System.out.println("Second number is: "+y);
        return x+y;
    };
        System.out.println("Addition of two numbers is: "+obj.add(3,8));
    }
}
