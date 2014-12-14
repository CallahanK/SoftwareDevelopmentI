package SavingsAccount;

public class SavingsAccount extends BankAccount
{  
  
   public SavingsAccount(double rate) 
   {  
      interestRate = rate;
   }

   public void addInterest() {  
      double interest = minimumBalance * interestRate / 100;
      deposit(interest);
      minimumBalance = getBalance();
   }

   public void deposit(double amount) {  
	   if (minimumBalance==0) {
		   minimumBalance=getBalance();
	   }
	   super.deposit(amount);
   }

   public void withdraw(double amount) {  
	   if (amount<minimumBalance) {
		   minimumBalance=amount;
	   }
	   super.withdraw(amount);
	}
	
   private double interestRate;
   private double minimumBalance;
}

