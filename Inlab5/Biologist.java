
/**
 * Write a description of class Biologist here.
 * 
 * @author Rust
 * @version October 3, 2016
 */
public class Biologist
{
    public static void identifyAnimal(Animal a)
    {
        String enviro = a.getEnvironment();
        boolean nice = a.getSeemsNice();
        
        switch(a.getNumLegs())
        {
            case 0: //things with no legs
                System.out.println("No Legs");
                if(enviro.equals("water"))
                    System.out.println("It's a water being \nFish");
                else if(enviro.equals("land"))
                    System.out.println("It lives on land \nSnake");
                else
                    System.out.println("Lives in the air \nfakerino");
                break;
            case 2: // things with two legs
                System.out.println("Two Legs");
                if(enviro.equals("land") && nice == true)
                    System.out.println("It lives on land \nIts nice \nIt's a wild classmate!");
                else if(enviro.equals("land") && nice == false) 
                    System.out.println("It lives on land \nIt doesn't seem nice \nBigfoot? Is that you?");           
                else
                    System.out.println("It lives in the air \nBird");
                break;
            case 4: //things with four legs
                System.out.println("Four Legs");
                if(nice == true)
                    System.out.println("Seems Nice \nMust be a dog");
                else
                    System.out.println("Doesn't Seem Nice \nObviously a skunk");
                break;
            default: //things with a number of legs that are not 0,2, or 4
                System.out.println("Danger Danger Crawly Thing");
                break;
        }
    }
    
    //decides if you should pet the animals or not, only dogs are supposed to be pet apperently
    public static void petOrNot(Animal a)
    {
        if(a.getSeemsNice() == true && a.getNumLegs() == 4)
            System.out.println("This animal is perfectly safe to pet\n");//(pet)
        else if(a.getSeemsNice() == false || a.getNumLegs() == 0)
            System.out.println("I would advise against petting this animal\n");//(dont pet)
        else
            System.out.println("Pet at your own risk\n");
        
    }
}
