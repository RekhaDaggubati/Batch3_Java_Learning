package practicing_Java;

public class ReturnStatement
{
    public void nonreturn()
    {
        System.out.println("Not returning any value");
    }
    public int addition(int a,int b)
    {
        return a+b;
    }
    public String concat(String c, String d)
    {
        return c+d;
    }

    public static void main(String[] args)
    {
        ReturnStatement obj = new ReturnStatement();
        obj.nonreturn();
        System.out.println("Addition of two numbers is: "+obj.addition(12,10));
        System.out.println("Concatenating two Strings:  "+obj.concat("Rekha","Daggubati"));
    }
}
