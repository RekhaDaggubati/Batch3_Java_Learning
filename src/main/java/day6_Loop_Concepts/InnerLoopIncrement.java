package day6_Loop_Concepts;

public class InnerLoopIncrement
{
    public static void main(String[] args)
    {
      //creating different number increment in each new line using inner loops
        int i;
        int j;
      for (i=1; i<=5; i++)
      {
          for (j=1; j<=i; j++)
          {
              System.out.print(i);
          }
          System.out.println();
      }

    }
}
