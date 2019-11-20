/**
 * Inlab6 number guessing game.
 * 
 * @author yaw / Rust
 * @version 07Oct16, 11oct16
 */
import java.util.Scanner;

public class GuessGame
{
    public static void example()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me a number:");
        int num = in.nextInt();
        System.out.println("You gave me " + num);
    }
    
    //infinite guesses, ten numbers
    public static void play1()
    {
        System.out.println("Version 1:");
        System.out.println("Guess a number between 1 and 10");
        int randNum = (int)(Math.random() * 10) + 1;    //randomly generates a number between 1 and 10
        Scanner in = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter your choice: ");
            int choice = in.nextInt();
            if(choice == randNum)
            {
                System.out.println("You got it right!");
                break;
            }
            else if(choice > randNum)
                System.out.println("Too high!");
            else if(choice < randNum)
                System.out.println("Too low.");
            else
                System.out.println("Hey, what are you trying to pull here...");
        }
    }
    
    //five guesses, twenty numbers
    public static void play2()
    {
        System.out.println("\nVersion 2:");
        System.out.println("Guess a number between 5 and 25");
        int randNum = (int)(Math.random() * 21) + 5;    //randomly generates a number between 5 and 25
        Scanner in = new Scanner(System.in);
        for(int i=1;i<6;i++)
        {
            System.out.println("Enter guess #" + i + ":");
            int choice = in.nextInt();
            if(choice == randNum)
            {
                System.out.println("You got it right!");
                break;
            }
            else if(choice > randNum)
                System.out.println("Too high!");
            else if(choice < randNum)
                System.out.println("Too low.");
            else
                System.out.println("Hey, what are you trying to pull here...");  
        }
    }
}
