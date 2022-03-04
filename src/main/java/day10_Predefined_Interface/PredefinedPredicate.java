package day10_Predefined_Interface;

import java.util.function.Predicate;

//Using Predefined Predicate Interface
public class PredefinedPredicate
{
    public static void main(String[] args)
    {
        //input: String output: Always Boolean
        Predicate<String> predicate = (a) -> a.length() <= 7;
       // Boolean val = predicate.test("Predicate");
        //System.out.println(val);
        System.out.println(predicate.test("Predicate"));
        //input: Integer
        Predicate<Integer> predicate1 = (x) -> x.intValue() == 8;
        System.out.println(predicate1.test(8));
        //input: Float
        Predicate<Float> predicate2 = (y) -> y.floatValue() >= 12.35f;
        System.out.println(predicate2.test(11.25f));
        //input: Boolean
        Predicate<Boolean> predicate3 = (b) -> b.booleanValue() == true;
        System.out.println(predicate3.test(true));
        //input: Character
        Predicate<Character> predicate4 = (c) -> c.charValue() == 'C';
        System.out.println(predicate4.test('c'));

    }
}
