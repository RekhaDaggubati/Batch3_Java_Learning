package day14_ExceptionHandling;

import java.util.Scanner;

public class AgeExceptionScanner
{
    //initializing variable
    int age;
    //initializing Scanner object
    Scanner scanner;
    //Defining the method
    public int initializeVariable()
    {
        //Declaring user value to Variable scanner
        scanner = new Scanner(System.in);
        System.out.print("Please enter your Age:");
        boolean incorrectAge = true;
        // To check whether the Age is valid or not, using While loop
        while(incorrectAge)
        {
            //initializing String variable and Changing String to integer

            try
            {
                String ageString = scanner.nextLine();
                age = Integer.parseInt(ageString);
                if(age<1 || age>150)
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
