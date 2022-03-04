package day14_ExceptionHandling;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        //initializing  String Variable
       // String val = "Hello";
        //converting String value to Integer
       // int no = Integer.parseInt(val);
        /* when we want to print no, it throws exception because for input string we are giving string value.
        if we get Exception then the remaining statements will not execute,it will stop in that statement only.
        in order to execute the remaining statements we have to use exception handling try and catch methods
         */
       // System.out.println(no);
        //here the below statements will not execute because the above statement has exception
       /* System.out.println("This is an exception");
        System.out.println("This is an exception");
        System.out.println("This is an exception");*/

           String val = "Hello";
          try
          {
              int no = Integer.parseInt(val);
              System.out.println(no);
              System.out.println("Try block executed successfully");
          }
          catch(NumberFormatException e)
          {
              System.out.println("Please enter correct value for converting to integer");
          }
        System.out.println("End of the code");
    }
}
