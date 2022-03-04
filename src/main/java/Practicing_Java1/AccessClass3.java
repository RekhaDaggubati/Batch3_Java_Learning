package Practicing_Java1;

import practicing_Java.AccessModifier;

public class AccessClass3 extends AccessModifier
{
    public static void main(String[] args)
    {
        AccessClass3 obj = new AccessClass3();
        System.out.println("public variable: "+obj.a);
        //System.out.println("private variable: "+obj.b);
        //System.out.println("default variable: "+obj.c);
        // protected variable is retrieved by using single inheritance
        System.out.println("protected variable: "+obj.d);
    }
}
