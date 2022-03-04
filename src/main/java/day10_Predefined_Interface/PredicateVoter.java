package day10_Predefined_Interface;

import java.util.function.Predicate;

//Using Predefined Predicate Interface
public class PredicateVoter
{
    public static void main(String[] args)
    {
        //voter is eligible to vote
        Predicate<Integer> voter = (a) -> a>=18;
        boolean age = voter.test(19);
        System.out.println("Eligible to vote: Major " +age);
        //voter is not eligible to vote
        Predicate<Integer> voter1 = (b) -> b<18 ;
        boolean age1 = voter1.test(8);
        System.out.println("Not eligible to vote: Minor " +age1);
        //Age should be greater than zero
        Predicate<Integer> voter2 = (c) -> c<=0;
        boolean age2 = voter2.test(0);
        System.out.println(age2 + ":Age should be greater than 0");
    }
}
