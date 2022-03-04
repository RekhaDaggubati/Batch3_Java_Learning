package Practicing_Java1;

import practicing_Java.AccessModifier;

public class AccessClass2
{
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        System.out.println("public variable: "+obj.a);
        // in other package the private,default and protected variables can not retrieve
        //protected variable can retrieve in another package by using single inheritance
        // System.out.println("private variable: "+obj.b);
        // System.out.println("default variable: "+obj.c);
        // System.out.println("protected variable: "+obj.d);
    }
}
