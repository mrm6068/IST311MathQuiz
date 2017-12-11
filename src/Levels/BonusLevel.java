
package Levels;

import Utilities.UserInput;
import java.util.Scanner;

/**
 *
 *
 */
public class BonusLevel 
{
    //Which level each instance represents.
    private int level;
    private int levelScore = 0;
    int answer;
    
    
    /**
    *
    *
    */
    public void playBonusOne()
    {
        //Random 2-10
        int num1 = 2 + (int)(Math.random() * ((10 - 2) + 1));
        //2-10, this num will be divisible by num1.
        int num2 = num1 * (2 + (int)(Math.random() * ((10 - 2) + 1)));
        //10-100
        int num3 = 10 + (int)(Math.random() * ((100 - 10) + 1));
        //num4 is uses to subtract half of answer so far for last part of bonus
        int num4 = (num2/num1 + num3 - num3) / 2;
        
        answer = num2/num1 + num3 - num4;
            
        System.out.print("What is " + num2 + " / " + num1 + " + " + num3
                + " - " + num4 + ": ");
        
        int userAnswer = UserInput.getAnswer();
        
        if(userAnswer == answer)
        {
            System.out.println("\tCorrect");
            System.out.println("\nBonus Passed");
            System.out.println("\nBonus: 150");
            levelScore = 150;
        }
        else
        {
            System.out.println("\tWrong");
            System.out.println("\nBonus Failed");
        }
          
    }
    
    public int getLevelScore()
    {
        return levelScore;
    }
   
}
