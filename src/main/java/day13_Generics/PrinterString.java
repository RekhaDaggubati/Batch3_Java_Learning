package day13_Generics;

public class PrinterString
{
    String printer;
    //creating constructor
    PrinterString(String printer)
    {
        this.printer = printer;
    }
    //creating method
    public void printString()
    {
        System.out.println(printer);
    }

    public static void main(String[] args) {
        PrinterString obj = new PrinterString("Generics");
        obj.printString();
    }
}
