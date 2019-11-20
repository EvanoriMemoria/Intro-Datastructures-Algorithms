/**
 * Recursion.
 * 
 * @author yaw 
 * @version 22 Nov 2016
 */
public class Recursion
{
    private static int temp;
    private static int indexTemp;
    private static int tempStart;
    
    //prints the array and sets temp and indexTemp equal to index 0 of the array
    public static void print(int[] array)
    {
        System.out.print(array[0]);
        for(int i=1;i<array.length;i++)
        {
            System.out.print("," + array[i]);
        }
        System.out.println();
        temp = array[0];
        indexTemp = array[0];
    }
    
    //calls smallestFrom with a starting index of 0
    public static int smallest(int[] array)
    {
        return smallestFrom(array, 0);
    }
    
    //recursively finds the smallest integer in the array
    private static int smallestFrom(int[] array, int start)
    {
        if(start < array.length && array[start] < temp)
        {
            temp = array[start];
        }
        if((start+1) <= array.length)
        {
            smallestFrom(array, start+1);
        }
        return temp;
    }
    
    //calls smallestIndexFrom starting at index 0
    public static int smallestIndex(int[] array)
    {
        return smallestIndexFrom(array, 0);
    }
    
    //recursively finds the index of the smallest integer in the array
    private static int smallestIndexFrom(int[] array, int start)
    {
        if(start < array.length && array[start] < indexTemp)
        {
            indexTemp = array[start];
            tempStart = start;
        }
        if((start+1) <= array.length)
        {
            smallestIndexFrom(array, start+1);
        }
        return tempStart;
    }
}
