package day2_Constructor_Method_overloading_variables;

public class  ConstructorConcepts {

    //creating instance variable

    int a=10;
    String b="Hello";

    //creating parameterized constructor

   /*ConstructorConcepts(int a , String b)

    {
       this.a = a;
       this.b = b;

    }*/

    //creating Zero constructor

    ConstructorConcepts()
    {
        System.out.println("It is Zero Constructor");
    }

    public static void main(String[] args) {

        ConstructorConcepts obj = new ConstructorConcepts();

        System.out.println(obj.a);
        System.out.println(obj.b);

    }

}


