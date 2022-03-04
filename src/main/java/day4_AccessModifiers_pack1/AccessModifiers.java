package day4_AccessModifiers_pack1;

public class AccessModifiers {
//instance variables
    //public
    public int a=10;
    //private
    private int b=20;
    //default
    int c=30;
    //protected
    protected int d=40;

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);

    }

}
