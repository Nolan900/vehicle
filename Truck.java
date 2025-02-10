package assignment2;

public class Truck extends Vehicle
{
    private int bedSize;

    public Truck(String make, String fuel, String colour, int bedSize) 
    {
        super(make, fuel, colour);
        this.bedSize = bedSize;
    }

    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Bed Size: " + bedSize);
    }
}