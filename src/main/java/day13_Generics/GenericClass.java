package day13_Generics;

public class GenericClass<T>
{
    T printer;
    //creating constructor
    GenericClass(T printer)
    {
        this.printer = printer;
    }
    //creating method
    public void printValue()
    {
        System.out.println(printer);
    }
}
