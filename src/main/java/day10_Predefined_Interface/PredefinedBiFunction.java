package day10_Predefined_Interface;

import java.util.function.BiFunction;

//Using Predefined BiFunction Interface
public class PredefinedBiFunction
{
    public static void main(String[] args)
    {
        //2inputs: String,String   output: String
        BiFunction<String, String, String> bifunction = (a,b) -> a.toUpperCase()+b.toLowerCase();
        System.out.println(bifunction.apply("testing","APPLICATION"));
        //2inputs: String,String   output: Integer
        BiFunction<String, String, Integer> bifunction1 = (c,d) -> c.length()+d.length();
        System.out.println(bifunction1.apply("Hello","Java"));
        //2inputs: String, String  output: Boolean
        BiFunction<String, String, Boolean> bifunction2 = (e,f) -> e.length() >= f.length();
        System.out.println(bifunction2.apply("Hello","Java"));
        //2inputs: Integer, Integer  output: String it is trowing error saying Integer cannot be return String Value

        //2inputs: Integer, Integer  output: Boolean
        BiFunction<Integer, Integer, Boolean> bifunction3 = (x,y) -> x>=y;
        System.out.println(bifunction3.apply(3,5));
        //2inputs: Integer, Integer  output: Integer
        BiFunction<Integer, Integer, Integer> bifunction4 = (m,n) -> m/n;
        System.out.println(bifunction4.apply(10,5));
        //2inputs: Integer, String  output: String
        BiFunction<Integer, String, String> bifunction5 = (g,h) -> g+h;
        System.out.println(bifunction5.apply(3,"Years"));
        //2inputs: Integer, String output: Integer throwing Error String can not be converted into Integer

       //2inputs: Float, Float  output: Double throwing Error Float can not be converted into Double

       //2inputs: Float, Float  output: String throwing Error Float can not be converted into String

       //2inputs: Float, Float  output: Float
       BiFunction<Float, Float, Float> bifunction6 = (i,j) -> i%j;
        System.out.println(bifunction6.apply(20.15f,5.5f));
       //2inputs: Boolean, Boolean  output: Boolean
       BiFunction<Boolean, Boolean, Boolean> bifunction7 = (k,l) -> k.booleanValue() == l.booleanValue();
        System.out.println(bifunction7.apply(true,true));
       //2inputs: Boolean, Boolean  output: Integer throws Error Boolean can not be converted into Integer

       //2inputs: Boolean, Boolean output: String throws Error Boolean can not be converted into String

    }
}
