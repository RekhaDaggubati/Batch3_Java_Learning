package day17_ArrayList_ClassNameas_Datatype;

import java.util.ArrayList;

public class EmployeeCollection
{
    public static void main(String[] args)
    {
        //List of Employee's details
        ArrayList<Employee> employee = new ArrayList<>();
        Employee employee1 = new Employee(1,"Nancy", "Davolio","Female","Obere Str. 57","Berlin","Manager","asdjh@gmai.com","full-time");
        Employee employee2 = new Employee(2,"Mary", "Canoye","Female","Delhi Str. 59","Plano","Senior Manager","sdfdfsd@gmai.com","Part-time");
        Employee employee3 = new Employee(3,"Tom", "Stever","Male","Atlanta Str. 23","Atlanta","Assistant Manager","vncxvbmx@gmai.com","full-time");
        Employee employee4 = new Employee(4,"John", "Tamme","Male","Cosmoplitan Str. 4","Denver","Director","uekhf@gmai.com","Part-time");
        Employee employee5 = new Employee(5,"Andrew", "Crate","Male","Main Str. 8","Charlotte","Project Manager","njkhf@gmai.com","full-time");
        Employee employee6 = new Employee(6,"Carin", "Macova","Female","Torento Str. 11","Raleigh","Scrum Master","ghghjfh@gmai.com","Part-time");
        //adding Employee details to the array using employee object
        employee.add(employee1);
        employee.add(employee2);
        employee.add(employee3);
        employee.add(employee4);
        employee.add(employee5);
        employee.add(employee6);
        //using for each loop to print one after other
        for(Employee emp: employee)
        {
            System.out.println("EmployeeId: "+emp.empId);
            System.out.println("EmployeeFirstName: "+emp.empFirstName);
            System.out.println("EmployeeLastName: "+emp.empLastName);
            System.out.println("EmployeeGender: "+emp.gender);
            System.out.println("EmployeeAddress: "+emp.address);
            System.out.println("EmployeeCity: "+emp.city);
            System.out.println("EmployeeDesignation: "+emp.designation);
            System.out.println("EmployeeEmailId: "+emp.emailId);
            System.out.println("EmployeeJobStatus: "+emp.jobStatus);
        }
    }

}
