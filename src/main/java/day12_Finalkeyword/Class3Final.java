package day12_Finalkeyword;

public class Class3Final
{
    //when we use final keyword in declaring variables, it protects overriding the value of variable
    //final int a = 10;
    int a = 10;

    public int val()
    {
         a = 20;
        return a;
    }

    public static void main(String[] args) {
        Class3Final obj = new Class3Final();
        System.out.println(obj.val());
    }
}
