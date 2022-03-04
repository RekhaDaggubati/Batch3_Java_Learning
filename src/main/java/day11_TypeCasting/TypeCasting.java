package day11_TypeCasting;

public class TypeCasting
{
    public static void main(String[] args)
    {
        //Widening conversion Type Casting
        int i = 45;
        double j = i;
        short k = 25;
        long l = k;
        System.out.println("Widening integer value 45 to double value:  "+j);
        System.out.println("Widening Short value 25 to Long value:  "+l);
        
        //Narrowing conversion Type Casting
        double x = 456.578;
        int y = (int) x;
        long m = 234567;
        short n = (short) m;
        System.out.println("Narrowing double value 456.578 to integer value:  "+y);
        System.out.println("Narrowing long value 234567 to short value:  "+n);
    }
}
