
package ist311mathquiz;

import java.util.Scanner;


public class LevelOne extends Level
{
//    static Scanner input = new Scanner(System.in);
//    private int levelScore = 0;
//    private long startTime = 0;
//    private int duration = 0;
//    private int timeBonus = 0;
    
    
    //Returns true if player passes level.
//    public boolean playLevelOne()
//    {
//        
//        System.out.println("\n--LEVEL ONE--\n");
//        
//        //Timestamp start time for time bonus.
//        startTime = System.nanoTime();
//        
//        //Creates five problems for the level
//        for(int i = 0; i < 5; i++)
//        {
//            //Create problem
//            LevelOneProblem q = new LevelOneProblem();
//            q.randomQuestion();//Randomly choose + - * or /
//
//            //Display question, get user answer.
//            System.out.print("What is " + q.getProblem() + ": ");
//            int userAnswer = input.nextInt();
//
//            if(userAnswer == q.getAnswer())//If answer is correct...
//            {
//                levelScore += 100;//Add 100 to levelScore
//                System.out.println("\tCorrect!");
//            }
//            else
//            {
//                System.out.println("\tWrong! Correct answer is " + q.getAnswer() );
//            }
//        }
// 
//        
//        //Calculate duration of level in seconds.
//        duration = (int)((System.nanoTime() - startTime) / 1000000000);
//        
//        //400 for the level means move to next level.
//        if(levelScore > 399)
//        {
//            setTimeBonus();
//            levelScore += timeBonus;//Add time bonus to level score.
//            System.out.println("\nLevel One Passed");
//            System.out.println("\nTime: " + duration + " seconds");
//            System.out.println("\nTime Bonus: " + timeBonus);
//            System.out.println("\nLevel Score: " + (levelScore));
//            return true;//Move to next level
//        }
//        
//        //No next level.
//        System.out.println("Level One Failed");
//        return false;
//    }
   
//    public Level(int level)
//    {
//        this.level = level;
//    }
    
//    public void setTimeBonus()
//    {
//        if(duration < 12)
//            timeBonus = 75;
//        else if(duration < 18)
//            timeBonus = 50;
//        else if(duration < 24)
//            timeBonus = 25;
//        else
//            timeBonus = 0;
//    }
//    
//    public int getLevelScore()
//    {
//        return levelScore;
//    }
//    
}
