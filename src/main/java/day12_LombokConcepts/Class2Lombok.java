package day12_LombokConcepts;

public class Class2Lombok
{
    public static void main(String[] args)
    {
        Class1Lombok obj = new Class1Lombok();
        obj.setA(45);
        obj.setB(55);
        System.out.println(obj.getA());
        System.out.println(obj.getB());
    }
}
