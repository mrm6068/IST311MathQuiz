
package ist311mathquiz;

import java.util.Scanner;


public class Level 
{
    protected static final Scanner input = new Scanner(System.in);
    protected int levelScore = 0;
    protected long startTime = 0;
    protected int duration = 0;
    protected int timeBonus = 0;
    //protected int level = 0;
    
    //Returns true if player passes level.
    public boolean playLevel(int level)
    {
        
        //Timestamp start time for time bonus.
        startTime = System.nanoTime();
        
        //Creates five problems for the level
        for(int i = 0; i < 5; i++)
        {
            //Create problem
            MathProblem q = getProblem(level);
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
 
        //Calculate duration of level in seconds.
        duration = (int) ((System.nanoTime() - startTime) / 1000000000);
        
        //400 for the level means move to next level.
        if(levelScore > 399)
        {
            setTimeBonus();
            levelScore += timeBonus;//Add time bonus to level score.
            System.out.println("\nLevel Passed");
            System.out.println("\nTime: " + duration + " seconds");
            System.out.println("\nTime Bonus: " + timeBonus);
            System.out.println("\nLevel Score: " + (levelScore));
            return true;//Move to next level
        }
        
        //No next level.
        System.out.println("\nLevel Failed");
        return false;
    }
    
    public void setTimeBonus()
    {
        System.out.println(duration);//testing
        if(duration < 12)
            timeBonus = 75;
        else if(duration < 18)
            timeBonus = 50;
        else if(duration < 24)
            timeBonus = 25;
        else
            timeBonus = 0;
    }
    
    public int getLevelScore()
    {
        return levelScore;
    }
    
    //Returns a problem of passed level.
    public MathProblem getProblem(int level)
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
   
   
}
