
package ist311mathquiz;
import java.util.Scanner;
/**
 *
 * @author Mike0_000
 */
public class MathProblem {


    public static void main(String[] args) 
    {
        test();
       
    }
    
    public static void test()
    {
    
        Scanner input = new Scanner(System.in);
        long startTime = System.nanoTime();
        
        System.out.print("Enter something: "); 
        String s = input.nextLine();
        
        long duration = (System.nanoTime() - startTime) / 1000000000;
        
        System.out.println("it took you " + duration + " seconds to type " + s);
    }
    
}
