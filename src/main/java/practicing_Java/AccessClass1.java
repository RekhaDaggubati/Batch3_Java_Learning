package practicing_Java;

public class AccessClass1
{
    public static void main(String[] args)
    {
        AccessModifier obj = new AccessModifier();
        System.out.println("public variable: "+obj.a);
        //in different class the private variable cannot retrieve
        //System.out.println("private variable: "+obj.b);
        System.out.println("default variable: "+obj.c);
        System.out.println("protected variable: "+obj.d);
    }
}
