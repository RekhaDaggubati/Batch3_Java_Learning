package day11_Static_NonStatic_Block;

public class StaticNonStaticBlock
{
    int a;
    static int b;
    //instance variable
    //int a;
//creating CONSTRUCTOR
   // StaticNonStaticBlock(int a)
    /*{
        this.a = a;
        System.out.println(a);
    }*/
    //Non_Static: This is another way to initialize non_static instance variable
    //Static: This is another way to initialize static instance variable
    //Order of precedence between Non_Static Static and Constructor
    //creating nonstatic block

    //Creating Constructor
    StaticNonStaticBlock()
    {
        System.out.println("I am Constructor");
    }

    //Creating Non_Static Block

    {
        System.out.println("I am Non_Static Block");
        a=2;
    }
    //Creating one more Non_Static Block
    {
        System.out.println("Altering Non_Static Block");
        a=4; //here the 'a' is overridden from 2 to 4
    }

    //Creating Static Block

    static{
        System.out.println("I am Static Block");
        b=3;
    }

    public static void main(String[] args)
    {
        StaticNonStaticBlock obj = new StaticNonStaticBlock();
        System.out.println(obj.a);
        System.out.println(b);
    }
}
