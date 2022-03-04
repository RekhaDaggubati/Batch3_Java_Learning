package day6_Loop_Concepts;

public class InnerLoopAlphabetsIncrement
{
    public static void main(String[] args)
    {
        //creating different Alphabets increment in each new line using inner loops
        /*char m;
        char n;
        for (m='A'; m<='F'; m++)
        {
            for (n='A'; n<=m; n++)
            {
                System.out.print(m);
            }
            System.out.println();
        }*/

        for (int i=1; i<=6; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print((char) (64+i));
            }
            System.out.println();
        }
    }
}
