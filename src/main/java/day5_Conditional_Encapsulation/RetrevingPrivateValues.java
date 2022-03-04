package day5_Conditional_Encapsulation;

public class RetrevingPrivateValues
{
    public static void main(String[] args)
    {
        Encapsulation obj = new Encapsulation();
        obj.setA(10);
        obj.setB("java");
        System.out.println(obj.getA());
        System.out.println(obj.getB());

    }
}
