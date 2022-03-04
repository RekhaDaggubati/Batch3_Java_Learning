package day4_AccessModifiers_pack2;

import day4_AccessModifiers_pack1.AccessModifiers;

public class Class2 extends AccessModifiers
{
    public static void main(String[] args) {
        Class2 obj = new Class2();
        System.out.println(obj.a);
        //default variable can not call because this is different package, within package default variable can retrieve.
        //protected variable can call in different package using single inheritance concept only.
        //without inheritance protected variable can not retrieve in different package.
        //we can inherit one class into another class using keyword "extends".
        System.out.println(obj.d);
    }

}








