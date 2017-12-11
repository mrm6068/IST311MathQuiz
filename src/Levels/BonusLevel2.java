package Levels;

import Utilities.UserInput;

/**
 *
 * @author Matthew Baun <mwb5755>
 */
public class BonusLevel2 {
    
     //Which level each instance represents.
    private int level;
    private int levelScore = 0;
    int answer;
    
    public void playBonusTwo()
    {
        //Random 2-20
        int num1 = 2 + (int)(Math.random() * ((20 - 2) + 1));
        //2-20, this num will be divisible by num1.
        int num2 = num1 * (2 + (int)(Math.random() * ((20 - 2) + 1)));
        //50-200
        int num3 = 50 + (int)(Math.random() * ((200 - 50) + 1));
        //num4 is used to subtract half of answer so far for last part of bonus
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
