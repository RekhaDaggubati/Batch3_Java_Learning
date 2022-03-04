package day5_Conditional_Encapsulation;

public class LargestNumber {
    private int a;
    private int b;
    private int c;
//using Encapsulation Set method
   public void setA( int a, int b, int c)
   {
       this.a = a;
       this.b = b;
        this.c =c;
    }
 //Using Encapsulation Get method
    public int getA( int a, int b,int c) {

        if ((a > b) && (a > c))
        {
            System.out.println("A is largest number");
        }
        else if ((b > a) && (b > c))
        {
            System.out.println("B is largest number");
        }
        else
        {
            System.out.println("C is largest number");
        }
        return a;
    }
    }




