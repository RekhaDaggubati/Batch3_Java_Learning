package day3_thiskeyword_returnstatement;

public class ReturningValues {


    public void notReturning()
    {

        System.out.println("Not returning values");
    }
//addition method
   public int addition(int a, int b)
    {
        return a+b;

    }
//string method
    public String concat(String a,String b)
    {
        return a+b;
    }
 //multiplication method
    public int multiply(int a, int b)
    {
        return a*b;
    }
 //division method
    public int division(int a, int b)
    {
        return a/b;
    }
// modulus method
    public int modulus(int a, int b)
    {
        return a%b;
    }
 //subtraction method
    public int subtraction(int a,int b)
    {
        return a-b;
    }

    public static void main(String[] args) {

        ReturningValues obj = new ReturningValues();
        obj.notReturning();
        int c = obj.addition(3,4);
        System.out.println(c);
        System.out.println(obj.concat("Rekha","Rani"));
        System.out.println(obj.multiply(3,4));
        System.out.println(obj.division(5,2));
        System.out.println(obj.modulus(10,5));
        System.out.println(obj.subtraction(8,4));

    }


}
