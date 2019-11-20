
/**
 * Write a description of class Driver here.
 * 
 * @author yaw/Rust
 * @version 26 Sep 2016
 */
public class Driver
{
    public static void main(String[] args)
    {        
        //create instance of Player class and set the number of at bats and hits
        Player p1 = new Player("Joe");
        p1.addAtBats(243);
        p1.addHits(72);
        
        //create instance of Player class and set the number of at bats and hits
        Player p2 = new Player("Sally");
        p2.addAtBats(112);
        p2.addHits(23);
        
        //create instance of Player class and set the number of at bats and hits
        Player p3 = new Player("Frank");
        p3.addAtBats(204);
        p3.addHits(65);
        
        //create instance of Player class and set the number of at bats and hits
        Player p4 = new Player("Joe");
        p4.addAtBats(243);
        p4.addHits(72);
        
        //create instance of Player class and set the number of at bats and hits
        Player p5 = new Player("Tony");
        p5.addAtBats(117);
        p5.addHits(37);
        
        //create instance of Player class and set the number of at bats and hits
        Player p6 = new Player("Katie");
        p6.addAtBats(31);
        p6.addHits(2);
        
        //create instance of Team class and assign Players
        Team t1 = new Team("Pirates", p2, p1, p3);
        
        //create instance of Team class and assign Players
        Team t2 = new Team("Twins", p4, p5, p6);

        //print out statistics for the team
        t1.printLeagueStats();
        t1.printStats();
        t2.printStats();
    }
}