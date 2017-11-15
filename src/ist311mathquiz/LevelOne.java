
package ist311mathquiz;

import java.util.Scanner;


public class LevelOne 
{
    static Scanner input = new Scanner(System.in);
    int levelScore = 0;
    
    //Returns true if player passes level.
    public boolean playLevelOne()
    {
        
        System.out.println("\n--LEVEL ONE--\n");
        
        //Question 1
        LevelOneProblem q1 = new LevelOneProblem();
        q1.randomQuestion();
        
        //Display question, get user answer.
        System.out.print("What is " + q1.getProblem() + ": ");
        int userAnswer = input.nextInt();
        
        if(userAnswer == q1.getAnswer())//If answer is correct...
        {
            levelScore += 100;//Add 100 to levelScore
        }
        
        //Question 2
        LevelOneProblem q2 = new LevelOneProblem();
        q2.randomQuestion();
        
        System.out.print("What is " + q2.getProblem() + ": ");
        userAnswer = input.nextInt();
        
        if(userAnswer == q2.getAnswer())
        {
            levelScore += 100;
        }
        
        //Question 3
        LevelOneProblem q3 = new LevelOneProblem();
        q3.randomQuestion();
        
        System.out.print("What is " + q3.getProblem() + ": ");
        userAnswer = input.nextInt();
        
        if(userAnswer == q3.getAnswer())
        {
            levelScore += 100;
        }
        
        //Question 4
        LevelOneProblem q4 = new LevelOneProblem();
        q4.randomQuestion();
        
        System.out.print("What is " + q4.getProblem() + ": ");
        userAnswer = input.nextInt();
        
        if(userAnswer == q4.getAnswer())
        {
            levelScore += 100;
        }
        
        //Question 5
        LevelOneProblem q5 = new LevelOneProblem();
        q5.randomQuestion();
        
        System.out.print("What is " + q5.getProblem() + ": ");
        userAnswer = input.nextInt();
        
        if(userAnswer == q5.getAnswer())
        {
            levelScore += 100;
        }
       
        System.out.println("\nLevel Score: " + levelScore);
        
        //400 for the level means move to next level.
        if(levelScore > 399)
        {
            System.out.println("\nLevel One Passed");
            return true;//Move to next level
        }
        
        //No next level.
        return false;
    }
    
    public int getLevelScore()
    {
        return levelScore;
    }
    
}
