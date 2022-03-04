package practicing_Java;

import java.util.Scanner;

public class AgeExceptionScanner
{
    // initialize variable
    int age;
    //initialize Scanner variable
    Scanner scanner;
    //defining method
    public int initializeVariable()
    {
       scanner = new Scanner(System.in);
        System.out.print("Enter your Age:");
        boolean incorrectAge = true;
        while(incorrectAge)
        {
            try
            {
                String ageString = scanner.nextLine();
                age = Integer.parseInt(ageString);
                if((age<1) || (age>150))
                {
                    System.out.print("Please enter your valid Age:");
                }
                else
                {
                    incorrectAge = false;
                }
            }
            catch(Exception e)
            {
                System.out.print("Please enter your valid Age:");
                incorrectAge = true;
            }
        }
        return age;
    }
    public static void main(String[] args)
    {
        AgeExceptionScanner obj = new AgeExceptionScanner();
        System.out.println("Your Age is: "+obj.initializeVariable());
    }
}


