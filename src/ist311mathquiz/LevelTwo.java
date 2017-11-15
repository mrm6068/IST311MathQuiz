
package ist311mathquiz;


import java.util.Scanner;

public class LevelTwo 
{
    static Scanner input = new Scanner(System.in);
    private int levelScore = 0;
    
    //Returns true if player passes level.
    public boolean playLevelTwo()
    {
        
        System.out.println("\n--LEVEL TWO--\n");
        
        //Creates five problems for the level
        for(int i = 0; i < 5; i++)
        {
            //Create problem
            LevelTwoProblem q = new LevelTwoProblem();
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
        
//        //Question 1
//        LevelTwoProblem q1 = new LevelTwoProblem();
//        q1.randomQuestion();
//        
//        //Display question, get user answer.
//        System.out.print("What is " + q1.getProblem() + ": ");
//        int userAnswer = input.nextInt();
//        
//        if(userAnswer == q1.getAnswer())//If answer is correct...
//        {
//            levelScore += 100;//Add 100 to levelScore
//        }
//        
//        //Question 2
//        LevelTwoProblem q2 = new LevelTwoProblem();
//        q2.randomQuestion();
//        
//        System.out.print("What is " + q2.getProblem() + ": ");
//        userAnswer = input.nextInt();
//        
//        if(userAnswer == q2.getAnswer())
//        {
//            levelScore += 100;
//        }
//        
//        //Question 3
//        LevelTwoProblem q3 = new LevelTwoProblem();
//        q3.randomQuestion();
//        
//        System.out.print("What is " + q3.getProblem() + ": ");
//        userAnswer = input.nextInt();
//        
//        if(userAnswer == q3.getAnswer())
//        {
//            levelScore += 100;
//        }
//        
//        //Question 4
//        LevelTwoProblem q4 = new LevelTwoProblem();
//        q4.randomQuestion();
//        
//        System.out.print("What is " + q4.getProblem() + ": ");
//        userAnswer = input.nextInt();
//        
//        if(userAnswer == q4.getAnswer())
//        {
//            levelScore += 100;
//        }
//        
//        //Question 5
//        LevelTwoProblem q5 = new LevelTwoProblem();
//        q5.randomQuestion();
//        
//        System.out.print("What is " + q5.getProblem() + ": ");
//        userAnswer = input.nextInt();
//        
//        if(userAnswer == q5.getAnswer())
//        {
//            levelScore += 100;
//        }
       
        System.out.println("\nLevel Score: " + levelScore);
        System.out.println("");
        
        //400 for the level means move to next level.
        if(levelScore > 399)
        {
            System.out.println("Level Two Passed");
            return true;//Move to next level
        }
        
        //No next level.
        System.out.println("Level Two Failed");
        return false;
    }
    
    public int getLevelScore()
    {
        return levelScore;
    }
    
}
