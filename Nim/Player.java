
/**
 * Computer Player Constructor
 * 
 * @author (Team 3) 
 * @version (12/6/10)
 */

import java.util.Random;

public class Player
{
    
    public Player()
    {
        random = new Random();
        intelligence = random.nextBoolean();
    }

    //true=smart  false=stupid
    public boolean isSmart()
    {
        return intelligence;
    }
    
    public void CompSubtract(Pile pileGame)
    {
        boolean ComMoved = false;
        
            for (int i = 0; i < 5 ; i++)
            {
                int amountSub = (int)(Math.pow(2, i + 2)-1);
                if(isSmart() && pileGame.getPile() - amountSub <= pileGame.getPile() / 2 && pileGame.getPile() - amountSub >= 1)
                {
                    pileGame.reducePile(pileGame.getPile() - amountSub);
                    ComMoved = true;
                }
            }
            
            if(ComMoved==false)
            {    
               if (((pileGame.getPile() / 2) - 1) > 0)
                    pileGame.reducePile((random.nextInt((pileGame.getPile() / 2) - 1)) + 1); 
                    
               if (((pileGame.getPile() / 2) - 1) == 0)
                    pileGame.reducePile(1);
               
            }
    }
    
    
    Random random;
    private boolean intelligence;
}
