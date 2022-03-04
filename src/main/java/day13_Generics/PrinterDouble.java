package day13_Generics;

public class PrinterDouble
{
    Double printer;
    //creating constructor
    PrinterDouble(Double printer)
    {
        this.printer = printer;
    }
    //creating method
    public void printDouble()
    {
        System.out.println(printer);
    }

    public static void main(String[] args) {
        PrinterDouble obj = new PrinterDouble(24.56);
        obj.printDouble();
    }
}
