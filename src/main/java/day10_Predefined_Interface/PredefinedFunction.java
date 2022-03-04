package day10_Predefined_Interface;
import java.util.function.Function;
//Using Predefined Function Interface
public class PredefinedFunction
{
    public static void main(String[] args)
    {
        //input: String output: String to Uppercase
        Function<String,String> function = (a) -> a.toUpperCase();
        //String val = function.apply("Java Project");
        System.out.println(function.apply("Java Project"));
        //input: String output: string to Lowercase
        Function<String,String> function1 = (b) -> b.toLowerCase();
        System.out.println(function1.apply("Team A"));
        //input: Boolean  output: Boolean
        Function<Boolean,Boolean> function2 = (c) -> c.booleanValue();
        System.out.println(function2.apply(true));
        //input: Integer  output: Integer
        Function<Integer,Integer> function3 = (d) -> d.intValue();
        System.out.println(function3.apply(50));
        //input: String  output: Integer
        Function<String,Integer> function4 = (e) -> e.length();
        System.out.println(function4.apply("Interface"));
    }
}
