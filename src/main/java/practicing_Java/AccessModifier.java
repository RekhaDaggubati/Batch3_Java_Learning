package practicing_Java;

public class AccessModifier
{
    //public variable
    public int a = 2;
    //private variable
    private int b = 3;
    //default variable
    int c = 4;
    //protected variable
    protected int d = 5;

    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        System.out.println("public variable: "+obj.a);
        System.out.println("private variable: "+obj.b);
        System.out.println("default variable: "+obj.c);
        System.out.println("protected variable: "+obj.d);
    }
}
