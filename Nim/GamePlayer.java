
/**
 * Game Executer
 * 
 * @author (Team 3) 
 * @version (12/6/10)
 */

import javax.swing.JOptionPane;
import java.util.Random;

public class GamePlayer
{
    public static void main(String[] args)
    {
        Pile pileGame = new Pile();
        Player comp = new Player();
        
        Random Rturn = new Random();
        int turn = Rturn.nextInt(2);
        boolean PTurn = (turn == 0);
        boolean CTurn = (turn == 1);
        if (PTurn) 
            JOptionPane.showMessageDialog(null, "Player goes first");
        else if(CTurn)
            JOptionPane.showMessageDialog(null, "Computer goes first");
        while (true)
        {
            int pileSize = pileGame.getPile();
            int legal = (pileGame.getPile() / 2);
            JOptionPane.showMessageDialog(null, "The size of the pile is " + pileSize);
            if(pileSize == 1)
            {
                if(PTurn)
                {
                    if (comp.isSmart())
                    JOptionPane.showMessageDialog(null, "Computer Wins \n Valient effort but the computer's take over will continue");
                    
                    if (!comp.isSmart())
                    JOptionPane.showMessageDialog(null, "Computer Wins \n You are just pathetic");
                    
                    System.exit(0);
                }
                if (CTurn)
                {
                    if (comp.isSmart())
                    JOptionPane.showMessageDialog(null, "Player Wins \n You must be a genius because this computer was unbeatable");
                    
                    if (!comp.isSmart())
                    JOptionPane.showMessageDialog(null, "Player Wins \n Good job I guess \n but really don't get that excited");
                    
                    System.exit(0);
                }
            }
            if (CTurn)
            {
                comp.CompSubtract(pileGame);
                pileSize = pileGame.getPile();
                legal = (pileGame.getPile() / 2);
                JOptionPane.showMessageDialog(null,"Computer moves \n The pile is now " + pileSize);
                PTurn = true;
                CTurn = false;
            }
            if (PTurn)
            {
                if(pileSize > 1)
                {
                    String input = JOptionPane.showInputDialog(null,"Enter the number of marbles you wish to take \n (an integer between 1 and "
                            + legal + "). The pile size is " + pileSize);
                    
                    while (!input.matches("([0-9]+(\\[0-9]+)?)+")) //checks to make sure it is numerical
                    {
                    JOptionPane.showMessageDialog(null, "Enter a legal value!");
                    input = JOptionPane.showInputDialog(null,"Enter the number of marbles you wish to take \n (an integer between 1 and "
                            + legal + "). The pile size is " + pileSize);
                        }
                        
                    int playerInput = Integer.parseInt(input);
                    if((playerInput > legal) || (playerInput < 1))
                    {
                        JOptionPane.showMessageDialog(null, "Enter a legal value!");
                    }
                    else if(playerInput <= legal && playerInput >= 1)
                    {
                        pileGame.reducePile(playerInput);
                        pileSize = pileGame.getPile();
                        legal = (pileGame.getPile() / 2);
                        PTurn = false;
                        CTurn = true;
                    }
                }
            }
        }
    }
}