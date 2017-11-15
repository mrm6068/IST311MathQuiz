
package ist311mathquiz;

import java.util.Scanner;


public class LevelOne 
{
    static Scanner input = new Scanner(System.in);
    int levelScore = 0;
    
    
    public boolean playLevelOne()
    {
        
        int scoreLevelOne = 0;
        
        System.out.println("--Level One--\n");
        
        //Question 1
        LevelOneProblem q1 = new LevelOneProblem();
        q1.randomQuestion();
        
        //Display question, get user answer.
        System.out.print("What is " + q1.getProblem() + ": ");
        int userAnswer = input.nextInt();
        
        if(userAnswer == q1.getAnswer())//If answer is correct...
        {
            scoreLevelOne += 100;//Add 100 to scoreLevelOne
        }
        
        //Question 2
        LevelOneProblem q2 = new LevelOneProblem();
        q2.randomQuestion();
        
        System.out.print("What is " + q2.getProblem() + ": ");
        userAnswer = input.nextInt();
        
        if(userAnswer == q2.getAnswer())
        {
            scoreLevelOne += 100;
        }
        
        //Question 3
        LevelOneProblem q3 = new LevelOneProblem();
        q3.randomQuestion();
        
        System.out.print("What is " + q3.getProblem() + ": ");
        userAnswer = input.nextInt();
        
        if(userAnswer == q3.getAnswer())
        {
            scoreLevelOne += 100;
        }
        
        //Question 4
        LevelOneProblem q4 = new LevelOneProblem();
        q4.randomQuestion();
        
        System.out.print("What is " + q4.getProblem() + ": ");
        userAnswer = input.nextInt();
        
        if(userAnswer == q4.getAnswer())
        {
            scoreLevelOne += 100;
        }
        
        //Question 5
        LevelOneProblem q5 = new LevelOneProblem();
        q5.randomQuestion();
        
        System.out.print("What is " + q5.getProblem() + ": ");
        userAnswer = input.nextInt();
        
        if(userAnswer == q5.getAnswer())
        {
            scoreLevelOne += 100;
        }
       
        
        //400 for the level means move to next level.
        if(scoreLevelOne > 399)
        {
            System.out.println("Level Score: " + scoreLevelOne);
            System.out.println("");
            System.out.println("Level One Passed\n");
            return true;//Move to next level
        }
        
        //No next level.
        System.out.println("Game Over");
        return false;
    }
    
}
