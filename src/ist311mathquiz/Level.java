
package ist311mathquiz;

import problems.*;//Created package with classes to create problems
import java.util.Scanner;

//Each instance of this class will represent a different level.
public class Level 
{
   
    private static final Scanner input = new Scanner(System.in);
    private int levelScore = 0;
    private long startTime = 0;
    private int duration = 0;
    private int timeBonus = 0;
    private int level;
    
    //Returns true if player passes level.
    public boolean playLevel()
    {
        //Time stamp start time for time bonus.
        startTime = System.nanoTime();
        
        //Creates five problems for the level
        for(int i = 0; i < 5; i++)
        {
            //Create proper problem for this level.
            MathProblem prob = createLevelProblem(level);
            prob.randomQuestion();//Randomly choose + - * or /

            //Display question, get user answer.
            System.out.print("What is " + prob.getProblem() + ": ");
            int userAnswer = input.nextInt();

            if(userAnswer == prob.getAnswer())//If answer is correct...
            {
                levelScore += 100;//Add 100 to levelScore
                System.out.println("\tCorrect!");
            }
            else
            {
                System.out.println("\tWrong! Correct answer is " + prob.getAnswer() );
            }
        }
 
        //Calculate duration of level in seconds.
        duration = (int) ((System.nanoTime() - startTime) / 1000000000);
        
        
        //400 for the level before bonus means move to next level.
        if(levelScore > 399)
        {
            setTimeBonus();
            levelScore += timeBonus;//Add time bonus to level score.
            System.out.println("\nLevel Passed");
            System.out.println("\nTime: " + duration + " seconds");
            System.out.println("\nTime Bonus: " + timeBonus);
            System.out.println("\nLevel Score: " + levelScore);
            return true;//Move to next level
        }
        
        //No next level.
        System.out.println("\nLevel Score: " + levelScore);
        System.out.println("\nLevel Failed");
        return false;
    }
    
    public void setTimeBonus()
    {
        //If level was completed in under given seconds.
        //3 * level makes sure harder levels are given more time.
        if(duration < 12 + (3 * level))//15 for level 1, 18 for level 2, etc.
            timeBonus = 100;
        else if(duration < 18 + (3 * level))
            timeBonus = 75;
        else if(duration < 24 + (3 * level))
            timeBonus = 50;
        else if(duration < 30 + (3 * level))
            timeBonus = 25;
        else
            timeBonus = 0;
    }
    
    public int getLevelScore()
    {
        return levelScore;
    }
    
    //Returns a problem of passed level.
    public MathProblem createLevelProblem(int level)
    {
        MathProblem problem = null;
        switch(level)
        {
            case 1: problem = new LevelOneProblem();
                break;
            case 2: problem = new LevelTwoProblem();
                break;
        }
        
        return problem;
    }
    //Constructs proper level.
    public Level(int level)
    {
        this.level = level;
    }
   
   
}
