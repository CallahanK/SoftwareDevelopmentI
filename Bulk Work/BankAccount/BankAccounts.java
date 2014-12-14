
/**
 * Excercise P3.1
 * 
 * @author (Kevin Callahan) 
 * @version (10/8/10)
 */


public class BankAccounts 
{
    public static void main (String[] args)
    {
        BankAccount myAccount = new BankAccount(1000);
        myAccount.withdraw(500);
        myAccount.withdraw(400);
        System.out.println("Your balance is $" + myAccount.getBalance());
        
        //P3.2 Interest
        myAccount.addInterest(10);
        System.out.println("Your balance is $" + myAccount.getBalance());
        
        
    }
}