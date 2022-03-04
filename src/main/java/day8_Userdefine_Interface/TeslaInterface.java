package day8_Userdefine_Interface;
//retrieving interface using keyword implements
public class TeslaInterface implements VehicleInterface
{
    //retrieving Abstract method from VehicleInterface
    public String VehicleName()
    {
        return "It is Tesla";
    }
    //retrieving abstract method from interface VehicleRegistration
    public String registration() {
        return "Registration is in Georgia";
    }
}
