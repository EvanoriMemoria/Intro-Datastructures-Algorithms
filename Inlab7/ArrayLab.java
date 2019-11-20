
/**
 * Write a description of class ArrayLab here.
 * 
 * @author Rust 
 * @version Oct 25, 2016
 */
public class ArrayLab
{
    private int[] arr;
    
    //constructor
    public ArrayLab(int elem)
    {
        arr = new int[elem];
    }
    
    //assign each element in the array a random integer between 0 and 10.
    public void initialize()
    {
        int rand = 0;
        for(int i=0; i<arr.length;i++)
        {
            rand = (int)(Math.random()*10)+1;
            arr[i]=rand;
        }
    }
    
    //print out the contents of the array
    public void print()
    {
        System.out.print(arr[0]);
        for(int i=1; i<arr.length;i++)
        {
            System.out.print("," + arr[i]);
        }
        System.out.println("\n");
    }
    
    //find and then print the average, maximum, and minimum value in the array
    public void printStats()
    {
        double total = 0;
        int biggest = arr[0];
        int smallest = arr[0];
        for(int i=1; i<arr.length;i++)
        {
            total += arr[i];
            if(arr[i]>biggest)
                biggest = arr[i];
            else if(arr[i]<smallest)
                smallest = arr[i];
        }
        System.out.println("Average Value: " + (total/2));
        System.out.println("Maximum Value: " + biggest);
        System.out.println("Minimum Value: " + smallest);
    }
    
    //searches the array (and prints the result) for an integer parameter passed
    public void search(int look)
    {
        boolean found = false;
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] == look)
                found = true;
        }
        if(found)
            System.out.println(look + " was found.");
        else
            System.out.println(look + " was not found.");
    }
}
