
package Utilities;
import java.util.logging.Logger;
import java.util.logging.Level;
/**
 * Utility class for timer methods
 */
public class Timer 
{
    /**
     * Counts down from 5, so user can prepare to play level.
    */
    public static void countdown()
    {
        int count = 5;//Countdown from 5.
        
        sleep(3);//Give user 5 seconds between levels to process results.
        
        System.out.println("Level starts in...");
        
        //Sleep for 1 second 5 times, printing count.
        while(count > 0)
        {
            System.out.println(count);
        
            sleep(1);
            
            count--;
        }
        System.out.println("");
    }
    
    /**
     * Makes program sleep for passed number of seconds.
    * @param seconds - Number of seconds to sleep.
    */
    public static void sleep(int seconds)
    {
        try
            {    
                Thread.sleep(seconds * 1000); 
            }
            
            catch (InterruptedException ex) 
            {
                Logger.getLogger(Timer.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
    }
}
