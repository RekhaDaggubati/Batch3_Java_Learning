package day8_JavaEight_Lambda_Concepts;
//using @FunctionalInterface
//creating interface
interface Subtraction
{
    public int sub(int a, int b);
}

public class LambdaSubtraction
{
    public static void main(String[] args)
    {
        Subtraction obj = (x,y) ->
        {
            System.out.println("first number is: "+x);
            System.out.println("second number is: "+y);
            return x-y;
        };
        System.out.println("Subtraction of two numbers is: "+obj.sub(7,2));
    }
}
