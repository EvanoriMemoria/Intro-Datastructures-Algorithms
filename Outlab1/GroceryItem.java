
/**
 * Write a description of class GroceryItem here.
 * 
 * @author Nic Rust 
 * @version September 7 2016
 */
public class GroceryItem
{
   private String name;
   private double cost;
   private int aisleNum;
   
   public GroceryItem(String n, double c, int a)
   {
       name = n;
       cost = c;
       aisleNum = a;
   }
   
   public String getName()
   {
       return name;
   }
   
   public double getCost()
   {
       return cost;
   }
   
   public int getAisle()
   {
       return aisleNum;
   }
   
   public void changeCost(double newCost)
   {
       cost = newCost;
   }
}
