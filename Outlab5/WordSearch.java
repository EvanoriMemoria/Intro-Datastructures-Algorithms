
/**
 * Write a description of class WordSearch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.io.*;
public class WordSearch
{
    private char[][] arr;
    private String word;
    private int recCounter;
    private boolean foundWord = false; 
    
    public WordSearch(char[][] arr)
    {
        this.arr = arr;
    }
    
    public void play()
    {
        while(true)
        {
            printArr();
            scan();
            if(word.equals("end"))
            {
                System.out.println("hope you enjoyed yourself.");
                break;
            }
            System.out.println("You gave me " + word);
            int lngth = word.length();
            String angle = "";
            int counter = 0;
            for(int row = 0; row < arr.length; row++)
            {
                for (int col = 0; col < arr[row].length; col++)
                {
                    if(arr[row][col] == word.charAt(0))
                    {
                        //System.out.println("First: row: " + row + " col: " + col);
                        if(row < arr.length-1 && arr[row+1][col] == word.charAt(1))
                        {
                            angle = "vertical";
                            //System.out.println("Second:" + angle + "row: " + (row+1) + " col: " + col);
                            recCounter = 0;
                            foundWord = false;
                            if(checkDirec(row+2,col,angle))
                            {
                                System.out.println(word + " found vertically at row " + row + " column " + col);
                            }
                            else
                            {
                                System.out.println(word + " was not found.");
                                break;
                            }
                        }
                        else if(col < arr[row].length-1 && arr[row][col+1] == word.charAt(1))
                        {
                            angle = "horizontal";
                            //System.out.println("Second:" + angle + "row: " + row + " col: " + (col+1));
                            recCounter = 0;
                            foundWord = false;
                            if(checkDirec(row,col+2,angle))
                            {
                                System.out.println(word + " found horizontally at row " + row + " column " + col);
                            }
                            else
                            {
                                System.out.println(word + " was not found.");
                                break;
                            }
                        }
                        else if(col < arr[row].length-1 && row < arr.length-1 && arr[row+1][col+1] == word.charAt(1))
                        {
                            angle = "diagonal";
                            //System.out.println("Second:" + angle + "row: " + (row+1) + " col: " + (col+1));
                            recCounter = 0;
                            foundWord = false;
                            if(checkDirec(row+2,col+2,angle))
                            {
                                System.out.println(word + " found diagonally at row " + row + " column " + col);
                            }
                            else
                            {
                                System.out.println(word + " was not found.");
                                break;
                            }
                        }
                        else
                            counter++;
                    }
                }
            }
            System.out.println("");
        }
    }
    
    public boolean checkDirec(int row, int col, String angle)
    {
        if(row < arr.length && arr[row][col] == word.charAt(recCounter+2))
        {
            System.out.println(arr[row][col]);
            System.out.println(word.charAt(recCounter+2));
            recCounter++;
            System.out.println("row: " + row + " counter: " + recCounter + " word Length: " + (word.length()-2));
            if(recCounter == word.length()-2)
            {
                //System.out.println("I'm false now");
                foundWord = true;
            }
            else
            {
                if(angle.equals("diagonal") && col < arr[row].length-1 && row < arr.length-1)
                {
                    checkDirec(row+recCounter,col+recCounter,"diagonal");
                }
                else if(angle.equals("vertical") && col < arr[row].length-1)
                {
                    checkDirec(row+recCounter,col,"vertical");
                }
                else
                {
                    checkDirec(row,col+recCounter,"horiontal");
                }
            }
            //System.out.println("I'm true now");
            return foundWord;
        }
        return foundWord;
    }
    
    public void printArr()
    {
        for(int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
            {
                System.out.print(arr[row][col]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public void scan()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What word do you want to search for? (Type end to quit)");
        word = in.nextLine();
    }
}
