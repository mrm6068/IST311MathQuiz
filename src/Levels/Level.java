package Levels;

import Utilities.*;//Created Utilities package.
import problems.*;//Created package with classes to create problems

/**
 *Each instance of this class will represent a different level.
 */
public class Level 
{
    //Which level each instance represents, initialized in constructor.
    private final int level;
    private int levelScore = 0;
    //For time bonus...
    private long startTime = 0;
    private int duration = 0;//Level duration in seconds.
    private int timeBonus = 0;
    
    
    /**
     * Plays the level this instance represents, creates 5 problems of proper level.
     * @return true if player passes level.
    */
    public boolean playLevel()
    {
        //Timestamp start time for time bonus.
        startTime = System.nanoTime();
        
        //Creates five problems for the level
        for(int i = 0; i < 5; i++)
        {
            //Create proper problem for this level.
            MathProblem prob = createLevelProblem(level);
            prob.randomQuestion();//Randomly choose + - * or /

            //Display question, get user answer.
            System.out.print("What is " + prob.getProblem() + ": ");
            int userAnswer = UserInput.getAnswer();

            if(userAnswer == prob.getAnswer())//If answer is correct...
            {
                levelScore += 100;//Add 100 to levelScore
                System.out.println("\tCorrect!\n");
            }
            else
            {
                System.out.println("\tWrong! Correct answer is " 
                        + prob.getAnswer() + "\n" );
            }
            
            Timer.sleep(2);//Sleep 2 seconds after each problem.
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
    
    /**
     * Sets time bonus earned for the level this instance represents
    */
    public void setTimeBonus()
    {
        //If level was completed in under an amount of seconds.
        //5 * level makes sure harder levels are given increasingly more time.
        if(duration < 12 + (5 * level))//17 for level 1, 22 for level 2, etc.
            timeBonus = 100;//Highest time bonus.
        else if(duration < 18 + (5 * level))
            timeBonus = 75;
        else if(duration < 24 + (5 * level))
            timeBonus = 50;
        else if(duration < 30 + (5 * level))
            timeBonus = 25;
        else
            timeBonus = 0;
    }
    
    /**
     * @return score for level.
    */
    public int getLevelScore()
    {
        return levelScore;
    }
    
    /**
     * Creates a math problem
     * @param level - Level of problem to be created.
     * @return - a MathProblem of proper level.
    */
    public MathProblem createLevelProblem(int level)
    {
        MathProblem problem = null;
        switch(level)
        {
            case 1: problem = new LevelOneProblem();
                break;
            case 2: problem = new LevelTwoProblem();
                break;
            case 3: problem = new LevelThreeProblem();
                break;
        }
        
        return problem;
    }
    
    //Constructs proper Level.
    public Level(int level)
    {
        this.level = level;
    }
   
}
