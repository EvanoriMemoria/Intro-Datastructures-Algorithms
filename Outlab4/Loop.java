
/**
 * Loops! Loops everywhere.
 * 
 * @author Rust 
 * @version 12oct16
 */
public class Loop
{
    //loop1 prints lower bound to upper bound ints
    public static void loop1(int lb, int ub, int incr)
    {
        System.out.println("------------------");
        System.out.println("-------Loop1------");
        System.out.println("------------------");
        for(int i=lb;i<=ub;i+=incr)
        {
            System.out.println(i);
        }
    }
    
    //loop2 prints lower bound to upper bound ints
    public static void loop2(int lb, int ub, int incr)
    {
        System.out.println("------------------");
        System.out.println("-------Loop2------");
        System.out.println("------------------");
        int i = lb;
        while(i<=ub)
        {
            System.out.println(i);
            i+=incr;
        }
    }
    
    //loop3 prints the alphabet in a pyramid shape.
    public static void loop3()
    {
        System.out.println("------------------");
        System.out.println("-------Loop3------");
        System.out.println("------------------");
        String alph = "abcdefghijklmnopqrstuvwxyz";
        for(int j=1;j<27;j++)
        {
            for(int i=0;i<j;i++)
            {
                System.out.print(alph.charAt(i));
            }
            System.out.println("");
        }
    }
    
    //loop4 generates ten random numbers (1-10) and prints how many times input value was generated
    public static void loop4(int val)
    {
        System.out.println("------------------");
        System.out.println("-------Loop4------");
        System.out.println("------------------");
        int counter = 0;
        for(int i=0;i<10;i++)
        {
            int randNum = (int)(Math.random()* 10)+1;
            System.out.println(randNum);
            if(randNum == val)
            {
                counter++;
            }
        }
        System.out.println(val + " was found " + counter + " time(s).");
    }
    
    //generates random values from 1-10 until the input value is generated five times.
    public static void loop5(int val)
    {
        System.out.println("------------------");
        System.out.println("-------Loop5------");
        System.out.println("------------------");
        int counter = 0;
        int iter = 0;
        while(counter<5)
        {
            int randNum = (int)(Math.random()* 10)+1;
            //System.out.println(randNum);
            if(randNum == val)
            {
                counter++;
            }
            iter++;
        }
        System.out.println("It took " + iter + " iterations to generate " + val + " five times.");
    }
    
}
