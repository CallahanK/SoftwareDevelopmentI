
/**
 * Pile Constructor
 * 
 * @author (Team 3) 
 * @version (12/6/10)
 */

import java.util.Random;

public class Pile
{
    public Pile()
    {
        Random generator = new Random();
        pileSize = generator.nextInt(90) + 10;
    }
    
    public int getPile()
    {
        return pileSize;
    }
    
    public int reducePile(int subtract) //problem at odd
    {
        int legal;
        if (subtract >= 1 && subtract <= (pileSize / 2))
        {
            pileSize = pileSize - subtract;
            legal = 1;
        }
        else
        {
            legal = -1;
        }
        return legal;
    }
    
    private int pileSize;
}
