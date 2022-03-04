package day16_ArrayList_concepts;

public class ArrayConcepts
{
    public static void main(String[] args)
    {
     //creating an Array of 5 numbers
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        //to find size of the array
        //System.out.println(array.length);
        //int arraySize = array.length;
        //using for loop to print Array values in console
        /*for (int i=0; i<arraySize; i++ ){
            System.out.println(array[i]);} */

           //using for each loop to print Array values.for each loop is used for only arryas and list in collections
            //for each loop will read each value one after other
            for(int a: array){
                System.out.println(a);
            }

    }
}
