/**
 * Savings Account Constructor
 * 
 * @author (Kevin Callahan) 
 * @version (10/12/10)
 */


public class SavingsAccount 
{
    public SavingsAccount()
    {
        balance=0;
        interest=0;
    }
   
    public SavingsAccount(double initialBalance, double interestRate)
    {
        balance = initialBalance;
        interest = interestRate;
    }
    
    public void deposit(double amount)
    {
        balance = balance+amount;
    }
    
    public void withdraw(double amount)
    {
        balance = balance-amount;
    }
    
    public void addInterest()
    {
        balance=(100*balance + balance*interest)/100;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    
    
    private double balance;
    private double interest;
    
}