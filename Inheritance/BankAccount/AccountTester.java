package SavingsAccount;


public class AccountTester
{  
public static void main(String[] args)
{  
   SavingsAccount profHLSavings = new SavingsAccount(0.5);
         
   profHLSavings.deposit(9999); 
   profHLSavings.withdraw(999);
   profHLSavings.deposit(99);
   
   System.out.println("Mom's savings balance is $" + profHLSavings.getBalance() +", pre-interest");
   
   profHLSavings.addInterest();
   
   System.out.println("Mom's savings balance is $" + profHLSavings.getBalance()+ ",with interest");

}
}
