
/**
 * Excercise P3.3
 * 
 * @author (Kevin Callahan) 
 * @version (10/13/10)
 */


public class SavingsAccounts 
{
    public static void main (String[] args)
    {
        SavingsAccount myAccount = new SavingsAccount(1000,10);
        
        myAccount.addInterest();        
        myAccount.addInterest();
        myAccount.addInterest();
        myAccount.addInterest();
        myAccount.addInterest();
        System.out.println("Your balance is $" + myAccount.getBalance());
        
        
    }
}