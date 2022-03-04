package day10_Predefined_Interface;

import java.util.function.BiConsumer;

//Using Predefined BiConsumer Interface
public class PredefinedBiConsumer
{
    public static void main(String[] args)
    {
        //2inputs: String, String
        BiConsumer<String,String> biconsumer = (a,b) -> System.out.println(a+b);
        biconsumer.accept("Java","Project");
        //2inputs: Integer, Integer
        BiConsumer<Integer,Integer> biconsumer1 = (x,y) -> System.out.println(x*y);
        biconsumer1.accept(3,4);
        //2inputs: Boolean, Boolean
        BiConsumer<Boolean,Boolean> biconsumer2 = (c,d) -> System.out.println(c==d);
        biconsumer2.accept(true,true);
        //2inputs: String, Integer
        BiConsumer<String,Integer> biconsumer3 = (e,z) -> System.out.println(e+z);
        biconsumer3.accept("Sprint",3);
        //2inputs: Boolean, String
        BiConsumer<Boolean,String> biconsumer4 = (g,m) -> System.out.println(g+m);
        biconsumer4.accept(true,"Java");
        //2inputs: Boolean, Integer is not accepting or throwing error

    }
}
