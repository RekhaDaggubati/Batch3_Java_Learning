package day17_Streams_java8Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsConcepts
{
    /*
    collection--1000 records
    duplicates--to avoid duplicate data
    sorting--asce,desc
    filter---after using filter the collection of records will reduce/shrink(300)
     */
    public static void main(String[] args)
    {
       /* List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);*/
        //we can add array values in single line also
        List<Integer> list = Arrays.asList(1,1,2,3,3,4,5,6,3,7,9,9,11);
        List<String> values = Arrays.asList("Apple","Mango","Pear","Kiwi","Gova","Coconut","Strawberry","Banana","Blueberry");
        //to eliminate duplicates
        System.out.println("Before eliminating the duplicates: "+list);
        System.out.println("After eliminating the duplicates: "+list.stream().distinct().collect(Collectors.toList()));
        //sorting the Array values into ascending order
        System.out.println("Sorting values in ascending order: "+list.stream().distinct().sorted().collect(Collectors.toList()));
        //sorting the array values into descending order
        System.out.println("Sorting values in descending order: "+list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        //to filter the number > 5 from array list
        System.out.println("Numbers greater than five: "+list.stream().distinct().sorted().filter(a -> a>5).collect(Collectors.toList()));
        //to filter the list of String length >= 5
        System.out.println("List of String length >= 5: "+values.stream().distinct().sorted().filter(a -> a.length()>=5).collect(Collectors.toList()));
        //to filter the list of string value names starting with letter B
        System.out.println("List of string value names starting with letter B: "+values.stream().distinct().sorted().filter(a -> a.startsWith("B")).collect(Collectors.toList()));
        //to add value 3 to each element in array list(mapping)
        System.out.println("Adding 3 to each element: "+list.stream().distinct().sorted().map(a -> a+3).collect(Collectors.toList()));
        //to multiply value 3 to each element in array list(mapping)
        System.out.println("Multiply 3 to each element: "+list.stream().distinct().sorted().map(a -> a*3).collect(Collectors.toList()));

    }

}
