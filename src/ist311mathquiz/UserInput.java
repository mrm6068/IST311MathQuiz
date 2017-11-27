/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist311mathquiz;
import java.util.Scanner;

/**
 *
 * @author Matthew Baun
 */
public class UserInput {
    
    static Scanner input = new Scanner(System.in);
    
    static int getAnswer()
    {  
        //String answer = "";
        
        while(!input.hasNextInt())    
        {
            System.out.print("\nPlease enter a positive integer:");
            input.next();
        }
        
        return Integer.parseInt(input.next());
    }
    
}
