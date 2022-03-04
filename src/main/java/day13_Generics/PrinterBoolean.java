package day13_Generics;

public class PrinterBoolean
{
    Boolean printer;
    //creating constructor
    PrinterBoolean(Boolean printer)
    {
        this.printer = printer;
    }
    //creating method
    public void printBoolean()
    {
        System.out.println(printer);
    }

    public static void main(String[] args) {
        PrinterBoolean obj = new PrinterBoolean(true);
        obj.printBoolean();
    }
}
