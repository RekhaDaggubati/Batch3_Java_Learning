package day2_Constructor_Method_overloading_variables;

public class VariableTypes {

    //defying Instance Variable

    int no=2;
    String name="abc";
    boolean x=true;
//    creating static variable
    static int var = 9;

//    creating method

    public void method1()

   {
//       creating local variable
        int a=1;
        int b=2;
        int sum=a+b;
       System.out.println(sum);
    }

    public static void main(String[] args) {
//       creating Object
        VariableTypes Obj = new VariableTypes();
        System.out.println(Obj.no);
        System.out.println(Obj.name);
        System.out.println(Obj.x);
        Obj.method1();
        System.out.println(var);



    }
}
