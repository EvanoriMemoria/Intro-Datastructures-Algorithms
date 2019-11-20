
/**
 * Write a description of class Team here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Team
{
    private String name;
    private Player p1;
    private Player p2;
    private Player p3;
    private static int teamCounter;     //tracks the number of teams created so far
    
    //team constructor
    public Team(String name, Player p1, Player p2, Player p3)
    {
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        teamCounter++;
    }
    
    //prints the stats for the team
    public void printStats()
    {
        
        int teamBats = p1.getAtBats()+p2.getAtBats()+p3.getAtBats();
        int teamHits = p1.getHits()+p2.getHits()+p3.getHits();
        System.out.println(name + ":");
        System.out.println("    At Bats: " + teamBats);
        System.out.println("    Hits: " + teamHits);
        System.out.println("    Batting Avg: " + (double)teamHits/teamBats);
        System.out.println("    Players:");
        p1.printStats();
        p2.printStats();
        p3.printStats();
    }
    
    //returns the total number of teams created so far
    public int getTeamCounter()
    {
        return teamCounter;
    }
    
    //prints out the league stats
    public void printLeagueStats()
    {
        System.out.println("League Stats: ");
        System.out.println("Number of Teams in league: " + teamCounter);
        System.out.println("Number of Players in the league: " + p1.getPlayerCounter() + "\n");
    }
}
