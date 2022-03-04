package day14_ExceptionHandling;

import java.util.Scanner;

public class GettingInputfromUser
{
    int age;
    Scanner scanner;
    public int initializeVariable()
        {
            scanner = new Scanner(System.in);
            System.out.print("Enter your age: ");
            String ageString = scanner.nextLine();
            age = Integer.parseInt(ageString);
            return age;
        }

    public static void main(String[] args) {
        GettingInputfromUser obj = new GettingInputfromUser();
        System.out.print("Your age is: "+obj.initializeVariable());
    }
}
