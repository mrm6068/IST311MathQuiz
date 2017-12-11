
package Utilities;
import java.util.Scanner;

/**
 *
 * @author Matthew Baun
 */
public class UserInput {
    
    static Scanner input = new Scanner(System.in);
    
    /**
    *@return Validated answer from user.
    */
    public static int getAnswer()
    {   
        while(!input.hasNextInt())    
        {
            System.out.print("\nPlease enter an integer:");
            input.next();
        }
        
        return Integer.parseInt(input.next());
    }
    
    public static char getResponse(){
        return input.next().charAt(0);
    }
    
}
