package practicing_Java;
//Creating Class
public class VariableTypes
{
    //creating Instance Variables
    int a = 10;
    float b = 134.56f;
    String c = "Java";
    //creating Method
    public void method(){
        //creating local variables
        char d = 'A';
        double e = 3456.567;
        System.out.println("Local Variable: "+d);
        System.out.println("Local Variable: "+e);
    }
    //creating Static variable
    boolean f = false;
    //creating main method
    public static void main(String[] args) {
        //creating Object
        VariableTypes obj = new VariableTypes();
        obj.method();
        System.out.println("Instance Variable: "+obj.a);
        System.out.println("Instance Variable: "+obj.b);
        System.out.println("Instance Variable: "+obj.c);
        System.out.println("Static Variable: "+obj.f);
    }
}
