/**
 * Write a description of class Fleet here.
 * 
 * @author Nic Rust
 * @version September 12, 2016
 */
public class Fleet
{
    private Ship ship1;
    private Ship ship2;
    private Ship ship3;
    private Ship ship4;
    
    //Fleet constructor
    public Fleet(Ship s1, Ship s2, Ship s3, Ship s4)
    {
        ship1 = s1;
        ship2 = s2;
        ship3 = s3;
        ship4 = s4;
    }
    
    //halves the current fuel of all four ships in the fleet.
    public void deploy()
    {
        ship1.halfFuel();
        ship2.halfFuel();
        ship3.halfFuel();
        ship4.halfFuel();
    }
    
    //sets the current fuel of all four ships to the fuel cap
    public void reFuel()
    {
        ship1.fullFuel();
        ship2.fullFuel();
        ship3.fullFuel();
        ship4.fullFuel();
    }
    
    //prints a summary of the fleet
    public void printSummary()
    {
        System.out.println("Name: " + ship1.getName() + ", Total Fuel Consumed: " + ship1.getFuelConsumed());
        System.out.println("Name: " + ship2.getName() + ", Total Fuel Consumed: " + ship2.getFuelConsumed());
        System.out.println("Name: " + ship3.getName() + ", Total Fuel Consumed: " + ship3.getFuelConsumed());
        System.out.println("Name: " + ship4.getName() + ", Total Fuel Consumed: " + ship4.getFuelConsumed());
    }
     
}
