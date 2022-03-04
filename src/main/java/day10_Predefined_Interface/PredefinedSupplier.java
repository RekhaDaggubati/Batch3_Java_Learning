package day10_Predefined_Interface;

import java.util.function.Supplier;

//Using Predefined Supplier Interface
public class PredefinedSupplier
{
    public static void main(String[] args)
    {
        //output: String
      Supplier<String>  supplier = () -> "Hello Java";
      //String val = supplier.get();
        System.out.println(supplier.get());
        //output: Integer
      Supplier<Integer>  supplier1 = () -> 20;
        System.out.println(supplier1.get());
        //output: Boolean
      Supplier<Boolean>  supplier2 = () -> true;
        System.out.println(supplier2.get());
        //output: Float
      Supplier<Float>  supplier3 = () -> 10.67f;
        System.out.println(supplier3.get());
        //output: Double
      Supplier<Double>  supplier4 = () -> 134.567;
        System.out.println(supplier4.get());
        //Output: Character
      Supplier<Character>  supplier5 = () -> 'A';
        System.out.println(supplier5.get());

    }
}
