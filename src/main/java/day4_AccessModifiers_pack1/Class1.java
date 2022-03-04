package day4_AccessModifiers_pack1;

public class Class1 {

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a);
        //can not call private variable because private is within the class it will not allow  retrieving into another class
        System.out.println(obj.c);
        System.out.println(obj.d);

    }
}
