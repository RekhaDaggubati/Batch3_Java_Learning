package practicing_Java;

public class ConditionalStatements
{
    public static void main(String[] args)
    {
        //using if statement
        int a = 10;
        int b = 53;
        int c = 45;

       /* if (a>b)
        {
            System.out.println("A is greater number");
        }*/
        //using Nested if statements
      /*  if (a>b)
        {
           if (b<c)
           {
               if (c>a)
               {
                   System.out.println("C is greater number");
               }
           }
        }*/
        //using if else statements
        if (a>b)
        {
            System.out.println("A is greater number");
        }
        else if (b>c)
        {
            System.out.println("B is greater number");
        }
        else
        {
            System.out.println("C is greater number");
        }
    }
}

