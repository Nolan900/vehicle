package assignment2;

/**
 *
 * @author nolan
 */
public class TestVehicles
{
    public static void main(String[] args)
    {
        Car car = new Car("Toyota", "Petrol", "Red");
        Truck truck = new Truck("Ford", "Diesel", "Blue", 10);
        Bus bus = new Bus("Mercedes", "Diesel", "Yellow");

        car.displayInfo();
        truck.displayInfo();
        bus.displayInfo();
    }
}

