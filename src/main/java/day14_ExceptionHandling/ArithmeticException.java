package day14_ExceptionHandling;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ArithmeticException {
    public static void main(String[] args) {
        //initializing the variables
        int a = 10;
        int b = 0;
        try
        {
            int c = a / b;
            //it gives infinity value, that is why it shows exception
            System.out.println("The Division of a,b is: " + c);
            System.out.println("Try block is executed successfully");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Please enter the correct integer value to divide");
        }
        finally{
            System.out.println("this is final block");
        }
        System.out.println("end of the code");
    }
}