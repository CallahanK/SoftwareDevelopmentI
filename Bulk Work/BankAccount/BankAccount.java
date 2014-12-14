/**
 * Bank Account Constructor
 * 
 * @author (Kevin Callahan) 
 * @version (10/5/10)
 */

import javax.swing.JOptionPane;


public class BankAccount 
{
    
    public BankAccount()
    {
        balance=0;
    }
   
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }
    //P6.15
    public void deposit(double amount)
    {
        if (amount>=0)
            balance = balance+amount;
        else
            JOptionPane.showMessageDialog(null,"ERROR You cannot deposit a negative amount");
    }
    //P6.15
    public void withdraw(double amount)
    {
        if (amount<0)
            JOptionPane.showMessageDialog(null,"ERROR You cannot withdraw a negative amount");
        
            else if (balance-amount<0)
            JOptionPane.showMessageDialog(null,"ERROR Overdraft Cannot continue");
                else
                balance = balance-amount;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    //P3.2 Interest
    void addInterest(double rate)
    {
        balance=(100*balance + balance*rate)/100;
    }
    
    
    private double balance;
    
}