package day13_Generics;

public class GenericTest
{
    public static void main(String[] args)
    {
        GenericClass<String> genericstring = new GenericClass<>("hello");
        genericstring.printValue();
        GenericClass<Integer> genericinteger = new GenericClass<>(45);
        genericinteger.printValue();
        GenericClass<Double> genericdouble = new GenericClass<>(450.45);
        genericdouble.printValue();
        GenericClass<Boolean> genericboolean = new GenericClass<>(true);
        genericboolean.printValue();
    }
}
