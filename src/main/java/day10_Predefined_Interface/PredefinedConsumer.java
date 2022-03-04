package day10_Predefined_Interface;

import java.util.function.Consumer;

//Using Predefined Consumer Interface
public class PredefinedConsumer
{
    public static void main(String[] args)
    {
        //Input: String
        Consumer<String> consumer = (a) -> System.out.println(a);
        consumer.accept("Hello Team");
        //Input: Integer
        Consumer<Integer> consumer1 = (x) -> System.out.println(x);
        consumer1.accept(20);
        //Input: Boolean
        Consumer<Boolean> consumer2 = (b) -> System.out.println(b);
        consumer2.accept(false);
        //Input: Double
        Consumer<Double> consumer3 = (c) -> System.out.println(c);
        consumer3.accept(534.345);
    }
}
