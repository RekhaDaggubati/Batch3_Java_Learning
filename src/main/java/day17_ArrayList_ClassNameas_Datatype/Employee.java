package day17_ArrayList_ClassNameas_Datatype;

public class Employee
{
    //instance Variables
    int empId;
    String empFirstName;
    String empLastName;
    String gender;
    String address;
    String city;
    String designation;
    String emailId;
    String jobStatus;

    //creating Constructor
    public Employee(int empId, String empFirstName, String empLastName, String gender, String address, String city, String designation, String emailId, String jobStatus)
    {
        this.empId = empId;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.designation = designation;
        this.emailId = emailId;
        this.jobStatus = jobStatus;
    }

}
