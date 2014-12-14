
/**
 * Exercise P6.10
 * 
 * @author (Kevin Callahan) 
 * @version (11/11/10)
 */
public class LexicgraphTester
{
    public static void main(String[] args)
    {
        Lexicograph set = new Lexicograph();
        
        set.addWord("Kevin");
        set.addWord("Alpha");
        set.addWord("Beta");
        set.addWord("Zeta");

        
        System.out.println("The lexicographic maximum is "+set.getLargest());
        System.out.println("The lexicographic minimum is "+set.getSmallest());
    }
    
}