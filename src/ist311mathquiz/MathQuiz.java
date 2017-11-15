
package ist311mathquiz;
import java.util.Scanner;

public class MathQuiz {

    
    static Scanner input = new Scanner(System.in);
    private static int score = 0;//score will be moved to a player.
    

    //Will return true if player passes level 1.
    public boolean levelOne()
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
        
        System.out.println("\nScore for level one is " + scoreLevelOne);
        
        score += scoreLevelOne;//Add level 1 score to total score
        
        //400 for the level means move to next level.
        if(scoreLevelOne > 399)
        {
            System.out.println("Level Score: " + scoreLevelOne);
            System.out.println("Total Score: " + score + "\n");
            System.out.println("Level One Passed\n");
            return true;//Move to next level
        }
        
        //No next level.
        System.out.println("Game Over");
        System.out.println("Total score: " + score);
        return false;
    }
    
    //Will return true if player passes level 1.
    public boolean levelTwo()
    {
        int scoreLevelTwo = 0;
        
        System.out.println("--Level Two--\n");
        
        //Question 1
        LevelOneProblem q1 = new LevelOneProblem();
        q1.randomQuestion();
        
        //Display question, get user answer.
        System.out.print("What is " + q1.getProblem() + ": ");
        int userAnswer = input.nextInt();
        
        if(userAnswer == q1.getAnswer())//If answer is correct...
        {
            scoreLevelTwo += 100;//Add 100 to scoreLevelOne
        }
        
        //Question 2
        LevelOneProblem q2 = new LevelOneProblem();
        q2.randomQuestion();
        
        System.out.print("What is " + q2.getProblem() + ": ");
        userAnswer = input.nextInt();
        
        if(userAnswer == q2.getAnswer())
        {
            scoreLevelTwo += 100;
        }
        
        //Question 3
        LevelOneProblem q3 = new LevelOneProblem();
        q3.randomQuestion();
        
        System.out.print("What is " + q3.getProblem() + ": ");
        userAnswer = input.nextInt();
        
        if(userAnswer == q3.getAnswer())
        {
            scoreLevelTwo += 100;
        }
        
        //Question 4
        LevelOneProblem q4 = new LevelOneProblem();
        q4.randomQuestion();
        
        System.out.print("What is " + q4.getProblem() + ": ");
        userAnswer = input.nextInt();
        
        if(userAnswer == q4.getAnswer())
        {
            scoreLevelTwo += 100;
        }
        
        //Question 5
        LevelOneProblem q5 = new LevelOneProblem();
        q5.randomQuestion();
        
        System.out.print("What is " + q5.getProblem() + ": ");
        userAnswer = input.nextInt();
        
        if(userAnswer == q5.getAnswer())
        {
            scoreLevelTwo += 100;
        }
        
        System.out.println("\nScore for level Two is " + scoreLevelTwo + "\n");
        
        score += scoreLevelTwo;//Add level 2 score to total score
        
        //400 for the level means move to next level.
        if(scoreLevelTwo > 399)
        {
            System.out.println("Level Score: " + scoreLevelTwo);
            System.out.println("Total Score: " + score + "\n");
            System.out.println("Level Two Passed\n");
            return true;//Move to next level
        }
        
        //No next level.
        System.out.println("Game Over");
        System.out.println("Total score: " + score);
        return false;
    }
    
    
   
    //Just storing this logic for now.
    public static void test()
    {
        Scanner input = new Scanner(System.in);
        long startTime = System.nanoTime();
        
        System.out.print("Enter something: "); 
        String s = input.nextLine();
        
        //duration in seconds.
        long duration = (System.nanoTime() - startTime) / 1000000000;
        
        System.out.println("it took you " + duration + " seconds to type " + s);
    }
    
}
