
/**
 * Creates the Player object
 * 
 * @author Nic Rust 
 * @version September 26 2016
 */
public class Player
{
    private String name;
    private int atBats;
    private int hits;
    private static int playerCounter;   //keeps track of the total number of players created
    
    //player constructor
    public Player(String name)
    {
        this.name = name;
        playerCounter++;
    }
    
    //returns the player name
    public String getPlayerName()
    {
        return name;
    }
    
    //returns the number of AtBats the player has had
    public int getAtBats()
    {
        return atBats;
    }
    
    //returns the number of hits the player has achieved
    public int getHits()
    {
        return hits;
    }
    
    //returns the batting average of the player (hits/bats)
    public double getBAvg()
    {
        return (double)hits/atBats;
    }
    
    //adds the input int of bats to the total for the player
    public void addAtBats(int addBats)
    {
        atBats += addBats;
    }
    
    //adds the unput int of hits to the total for the player
    public void addHits(int addHts)
    {
        hits += addHts;
    }
    
    //prints out the stats for the player
    public void printStats()
    {
        System.out.println("        " + name+"---> At Bats: " + atBats + ", Hits: " + hits + ", Batting Avg: " + (double)hits/atBats);
    }
    
    //returns the number of players created so far.
    public int getPlayerCounter()
    {
        return playerCounter;
    }
}
