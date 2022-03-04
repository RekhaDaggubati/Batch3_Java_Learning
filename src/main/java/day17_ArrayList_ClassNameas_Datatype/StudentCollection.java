package day17_ArrayList_ClassNameas_Datatype;

import java.util.ArrayList;

public class StudentCollection
{
    public static void main(String[] args)
    {
        //creating object for arraylist
        //list of students
        ArrayList<Student> arrayList = new ArrayList<>();
        Student student1 = new Student(1,"sam","A","FirstClass");
        Student student2 = new Student(2,"john","B","OutStanding");
        Student student3 = new Student(3,"Andrew","C","Distinction");
        Student student4 = new Student(4,"Rama","D","SecondClass");
        //adding student details to the array using arrayList object

        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        //using for each loop to print one after other
        for(Student stu: arrayList)
        {
            System.out.println("Student id: "+stu.stuId);
            System.out.println("Student Name: "+stu.stuName);
            System.out.println("Student group: "+stu.group);
            System.out.println("Student grade: "+stu.grade);
        }
    }
}
