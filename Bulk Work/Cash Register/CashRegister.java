
/**
 * CashRegister Constructor
 * 
 * @author (Kevin Callahan) 
 * @version (10/23/10)
 */
public class CashRegister
{
    
    public CashRegister()
    {
        purchase=0;
        payment=0;
    }

    public void recordPurchase(double amount)
    {
       purchase=purchase+amount;
       counter++;
    }
    
    public void enterPayment(int dollars, int quarters, int dimes, int nickels, int pennies)
    {
        payment = dollars + quarters * QUARTERS_VALUE + dimes * DIME_VALUE + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
    }
    
    public double giveChange()
    {
        change=payment-purchase;
        purchase=0;
        payment=0;
        counter=0;
        return change;
    }
   
    //P4.1
    public void enterDollars(int dollars)
    {
        payment=payment+dollars;
    }
    
    public void enterQuarters(int quarters)
    {
        payment=payment+quarters * QUARTERS_VALUE;
    }

    public void enterDimes(int dimes)
    {
        payment=payment+dimes * DIME_VALUE;
    }
    
    public void enterNickels(int nickels)
    {
        payment=payment+nickels * NICKEL_VALUE;
    }
    
    public void enterPennies(int pennies)
    {
        payment=payment+pennies * PENNY_VALUE;
    }
    
    //P4.2
    public int getItemCount()
    {
        return counter;
    }
    
    //P4.11
    public int giveDollars()
    {
        int dollars=0;
        while (change>=1)
        {
            change--;
            dollars++;
        }
        
        return dollars;
    }
    
    public int giveQuarters()
    {
        int quarters=0;
        while (change>=0.25)
        {
            change=change-0.25;
            quarters++;
        }
        
        return quarters;
    }
    
    public int giveDimes()
    {
        int dimes=0;
        while (change>=0.1)
        {
            change=change-0.1;
            dimes++;
        }
        
        return dimes;
    }
    
    public int giveNickels()
    {
        int nickels=0;
        while (change>=0.05)
        {
            change=change-0.05;
            nickels++;
        }
        
        return nickels;
    }
    
    public int givePennies()
    {
        int pennies=0;
        while (change>=0.01)
        {
            change=change-0.01;
            pennies++;
        }
        
        return pennies;
    }
    

    public static final double QUARTERS_VALUE=0.25;
    public static final double DIME_VALUE=0.1;
    public static final double NICKEL_VALUE=0.05;
    public static final double PENNY_VALUE=0.01;
    
    private double purchase;
    private double payment;
    private int counter;
    private double change;
}
