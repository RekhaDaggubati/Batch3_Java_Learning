package day14_ExceptionHandling;

import java.util.Scanner;

public class AgeExceptionScanner1
{
    Scanner scanner;

    public int initializeVariable1()
    {
        scanner = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int ageString = 0;
        try
        {
            ageString = scanner.nextInt();
        }
        catch(Exception e)
        {
            scanner.nextLine();
        }
        do
        {
            if(ageString>0 && ageString<=1000)
            {
                System.out.println("valid Age");
            }
            else
            {
                System.out.println("Enter the valid age:");
                try
                {
                    ageString = scanner.nextInt();
                }
                catch(Exception e)
                {
                    scanner.nextLine();
                }
            }
        }
        while(ageString>=0);
        return ageString;
    }

    public static void main(String[] args)
    {
      AgeExceptionScanner1 obj = new AgeExceptionScanner1();
        System.out.println("Your age is: "+obj.initializeVariable1());
    }
}
