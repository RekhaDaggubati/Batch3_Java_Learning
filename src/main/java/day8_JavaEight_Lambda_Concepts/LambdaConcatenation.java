package day8_JavaEight_Lambda_Concepts;
@FunctionalInterface
//Creating interface
interface Concatenation
{
    public String concat(String a,String b);
}

public class LambdaConcatenation
{
    public static void main(String[] args)
    {
        //Concatenation obj = (m,n) -> m+n;
        //System.out.println(obj.concat("Hello","world"));
        Concatenation obj = (m,n) -> {
            System.out.println("First word is: "+m);
            System.out.println("Second word is: "+n);
            return m+n;
        };
        System.out.println("Concatenation of two words is: "+obj.concat("Hello","World"));
    }
}
