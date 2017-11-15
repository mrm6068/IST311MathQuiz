
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
        
        //Creates five problems for the level
        for(int i = 0; i < 5; i++)
        {
            //Create problem
            LevelOneProblem q = new LevelOneProblem();
            q.randomQuestion();//Randomly choose + - * or /

            //Display question, get user answer.
            System.out.print("What is " + q.getProblem() + ": ");
            int userAnswer = input.nextInt();

            if(userAnswer == q.getAnswer())//If answer is correct...
            {
                levelScore += 100;//Add 100 to levelScore
                System.out.println("\tCorrect!");
            }
            else
            {
                System.out.println("\tWrong! Correct answer is " + q.getAnswer() );
            }
        }
 
        System.out.println("\nLevel Score: " + levelScore);
        
        //400 for the level means move to next level.
        if(levelScore > 399)
        {
            System.out.println("\nLevel One Passed");
            return true;//Move to next level
        }
        
        //No next level.
        System.out.println("Level One Failed");
        return false;
    }
    
    public int getLevelScore()
    {
        return levelScore;
    }
    
}
