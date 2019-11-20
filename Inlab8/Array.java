
/**
 * Write a description of class Array here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array
{
    private int[] arr;
    
    //constructor
    public Array(int elem)
    {
        arr = new int[elem];
    }
    
    //fills the array with random values 0-9
    public void fill()
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = (int)(Math.random()*10);
        }
    }
    
    //prints the values of the array in the very specific way described
    public void print()
    {
        for(int j=0;j<(arr.length*2)+1;j++)
        {
            System.out.print("-");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("|" + arr[i]);
        }
        System.out.println("|");
        for(int l=0;l<(arr.length*2)+1;l++)
        {
            System.out.print("-");
        }
        System.out.println();
    }
    
    //sorts the array
    public void sort()
    {
        int current = 0;
        int prev = 0;
        int counter = 0;
        boolean end = true;
        
        while(end)
        {
            for(int i=1;i<arr.length;i++)
            {
                current = arr[i];
                prev = arr[i-1];
                if(arr[i]<arr[i-1])
                {
                    counter = 0;
                    arr[i] = prev;
                    arr[i-1] = current;
                }
                else
                {
                    counter++;
                    if(counter >= arr.length)
                    {
                        end = false;
                    }
                }
            }
        }
    }
    
    //prints the amount of times a number appears
    public void printFrequency()
    {
        int counter = 0;
        for(int i=0;i<10;i++)
        {
            counter = 0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j] == i)
                {
                    counter++;
                }
            }
            System.out.println("There are " + counter + ", " + i + "'s");
        }
    }
}
