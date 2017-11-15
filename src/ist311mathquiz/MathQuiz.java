
package ist311mathquiz;
import java.util.Scanner;

public class MathQuiz {

    private int score = 0;//score will be moved to a player.
   
   
    public void setScore(int score)
    {
        this.score = score;
    }
    
    public int getScore()
    {
        return score;
    }
            
    //Just storing this logic for now.
    public static void test()
    {
        Scanner input = new Scanner(System.in);
        long startTime = System.nanoTime();
        
        System.out.print("Enter something: "); 
        String s = input.nextLine();
        
        //duration in seconds.
        long duration = (System.nanoTime() - startTime) / 1000000000;
        
        System.out.println("it took you " + duration + " seconds to type " + s);
    }
    
}
