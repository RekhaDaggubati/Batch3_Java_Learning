package day10_Predefined_Interface;

import java.util.function.BiPredicate;

//Using Predefine BiPredicate interface
public class PredefinedBiPredicate
{
    public static void main(String[] args)
    {
        //2inputs: Boolean, Boolean   output:Boolean
        BiPredicate<Boolean, Boolean> bipredicate = (a, b) -> a.booleanValue() == b.booleanValue();
        //boolean val = bipredicate.test(true, false);
        System.out.println(bipredicate.test(true,false));
        //2inputs: String, String   output:Boolean
        BiPredicate<String, String> bipredicate1 = (c,d) -> c.length() > d.length();
        System.out.println(bipredicate1.test("Sdet","Training"));
        //2inputs: Integer, Integer  output: Boolean
        BiPredicate<Integer,Integer> bipredicate2 = (x,y) -> x.intValue() < y.intValue();
        System.out.println(bipredicate2.test(4,8));
        //2inputs: Integer, String  output: Boolean
        BiPredicate<Integer, String> bipredicate3 = (m,e) -> m.intValue() > e.length();
        System.out.println(bipredicate3.test(5,"Java"));
        //2inputs: Float, Double  output: Boolean
        BiPredicate<Float, Double> bipredicate4 = (g,h) -> g.floatValue() >= h.doubleValue();
        System.out.println(bipredicate4.test(23.45f,134.567));
    }
}
