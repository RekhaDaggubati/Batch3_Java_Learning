package day16_ArrayList_concepts;

import java.util.ArrayList;

public class ArrayListConcept {
    public static void main(String[] args)
    {
        //here arrayList object is taking all datatype default ,if we don't mention what datatype it is.
        //it defaults consider as generic <>

       /* ArrayList arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add(1);
        arrayList.add(true);*/

        //using Integer datatype in generic <>
        ArrayList<Integer> arrayList = new ArrayList<>();
       /* arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);*/

       /* for (int a: arrayList)
        {
            System.out.println(a);
        }*/
    //to add array elements list of 10 using for loop
        for (int i=0; i<=10; i++){
            arrayList.add(i);
        }

        //java 8 concepts
       // arrayList.forEach(a -> System.out.println(a));
        //to retrieve first element of array
        System.out.println(arrayList.get(0));
        //to print the size of array
        System.out.println(arrayList.size());
        //before update
        System.out.println("before update: "+arrayList);
        //to update the second element
        System.out.println(arrayList.set(2,40));
        //after update
        System.out.println("After update: "+arrayList);
        //to remove element
        arrayList.remove(1);
        //after removal
        System.out.println("After removal: "+arrayList);
    }
}