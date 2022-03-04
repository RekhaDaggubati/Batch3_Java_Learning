package practicing_Java;

public class LargestNoEncapsulation
{
    private int a;
    private int b;
    private int c;

    //Using Encapsulation Setters and Getters


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public String checkLargestNo(int a,int b,int c)
    {
        if ((a > b) && (a > c))
        {
            //return a;
            return ("A is largest number");
        }
        else if ((b > a) && (b > c))
        {
            //return b;
            return ("B is largest number");
        }
        else
        {
            //return c;
             return ("C is largest number");
        }
    }
}
