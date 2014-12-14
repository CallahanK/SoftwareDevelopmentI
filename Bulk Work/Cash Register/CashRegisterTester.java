
/**
 * CashRegister Tester
 * 
 * @author (Kevin Callahan) 
 * @version (10/23/10)
 */
public class CashRegisterTester
{
    public static void main(String[] args)
    {
        CashRegister register= new CashRegister();
        
        register.recordPurchase(0.75);
        register.recordPurchase(1.50);
        register.enterPayment(2, 0, 5, 0, 0);
        register.enterDimes(2);
        System.out.println("You have purchased " +register.getItemCount()+" items");
        System.out.printf("Change=%5.2f%n",register.giveChange());
        System.out.println("Dollars="+register.giveDollars()+" Quarters="+register.giveQuarters()+" Dimes="+register.giveDimes()+" Nickels="+register.giveNickels()+" Pennies="+register.givePennies());
        
        register.recordPurchase(2.25);
        register.recordPurchase(19.25);
        register.enterPayment(23, 2, 0, 0, 0);
        System.out.printf("Change=%5.2f%n",register.giveChange());
        System.out.println("Dollars="+register.giveDollars()+" Quarters="+register.giveQuarters()+" Dimes="+register.giveDimes()+" Nickels="+register.giveNickels()+" Pennies="+register.givePennies());
    }
}
