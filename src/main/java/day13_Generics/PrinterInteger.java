package day13_Generics;

public class PrinterInteger
{
    Integer printer;
    //creating constructor
    PrinterInteger(Integer printer)
    {
        this.printer = printer;
    }
    //creating method
    public void printInteger()
    {
        System.out.println(printer);
    }

    public static void main(String[] args) {
        PrinterInteger obj = new PrinterInteger(50);
        obj.printInteger();
    }
}
