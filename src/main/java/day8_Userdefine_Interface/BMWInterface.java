package day8_Userdefine_Interface;
//retrieving interface using keyword implements
public class BMWInterface implements VehicleInterface
{
//retrieving abstract method from interface VehicleInterface
    public String VehicleName() {
        return "It is BMW";
    }
//retrieving abstract method from interface VehicleRegistration
    public String registration() {
        return "Registration is in Colorado";
    }
}
