package day6_Loop_Concepts;

public class Break_Continue_Concepts
{
    public static void main(String[] args)
    {
        //Using Break And Continue in Loops Concept
        //Break
       /* for(int i=1; i<=10; i++ )
        {
            if(i==5)
            {
                break;
            }
            System.out.println(i);
            //System.out.print(i + " ");
        }*/
        //Continue
        for (int i=1; i<=10; i++)
        {
            if(i==5)
            {
                continue;
            }
            //System.out.println(i);
            System.out.print(i + " ");
        }
    }
}
