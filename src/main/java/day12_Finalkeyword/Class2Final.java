package day12_Finalkeyword;

public class Class2Final extends Class1Final
    //when we use final keyword in class then it will not allow inheritance,it protects inheritance
{
    //when we use final keyword in class1 method, the error occurs in class2 method because we extends class2
    //with class1 and both methods are same, when we declare final that means that method can not use in any other methods
    //final keyword used in method protects overriding the methods

    public void method()
    {
        System.out.println("Class2 method");
    }

    public static void main(String[] args)
    {
        Class1Final obj = new Class2Final();
        obj.method();
    }
}
