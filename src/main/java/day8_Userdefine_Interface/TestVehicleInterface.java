package day8_Userdefine_Interface;

public class TestVehicleInterface
{
    public static void main(String[] args)
    {
        VehicleInterface vehicle = new BMWInterface();
        String nameBMW = vehicle.VehicleName();
        System.out.println(nameBMW);
        System.out.println(vehicle.registration());

        VehicleInterface vehicle1 = new TeslaInterface();
        String nameTesla = vehicle1.VehicleName();
        System.out.println(nameTesla);
        System.out.println(vehicle1.registration());

        VehicleInterface vehicle2 = new AUDIInterface();
        String nameAUDI = vehicle2.VehicleName();
        System.out.println(nameAUDI);
        System.out.println(vehicle2.registration());
    }
}
