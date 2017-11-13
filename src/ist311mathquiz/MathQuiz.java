
package ist311mathquiz;
import java.util.Scanner;

public class MathQuiz {

    static int score = 0;//score will be moved to a player.

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--Level One--\n");
        
        //Question 1
        LevelOne q1 = new LevelOne();
        q1.randomQuestion();
        
        //Display question, get user answer.
        System.out.print("What is " + q1.getProblem() + ": ");
        int userAnswer = input.nextInt();
        
        if(userAnswer == q1.getAnswer())//If answer is correct...
        {
            score += 100;
        }
        
        //Question 2
        LevelOne q2 = new LevelOne();
        q2.randomQuestion();
        
        System.out.print("What is " + q2.getProblem() + ": ");
        userAnswer = input.nextInt();
        
        if(userAnswer == q2.getAnswer())
        {
            score += 100;
        }
        
        //Question 3
        LevelOne q3 = new LevelOne();
        q3.randomQuestion();
        
        System.out.print("What is " + q3.getProblem() + ": ");
        userAnswer = input.nextInt();
        
        if(userAnswer == q3.getAnswer())
        {
            score += 100;
        }
        
        //Question 4
        LevelOne q4 = new LevelOne();
        q4.randomQuestion();
        
        System.out.print("What is " + q4.getProblem() + ": ");
        userAnswer = input.nextInt();
        
        if(userAnswer == q4.getAnswer())
        {
            score += 100;
        }
        
        //Question 5
        LevelOne q5 = new LevelOne();
        q5.randomQuestion();
        
        System.out.print("What is " + q5.getProblem() + ": ");
        userAnswer = input.nextInt();
        
        if(userAnswer == q5.getAnswer())
        {
            score += 100;
        }
        
        System.out.println("Score is " + score);
    }
    
    public static void test()
    {
        Scanner input = new Scanner(System.in);
        long startTime = System.nanoTime();
        
        System.out.print("Enter something: "); 
        String s = input.nextLine();
        
        long duration = (System.nanoTime() - startTime) / 1000000000;
        
        System.out.println("it took you " + duration + " seconds to type " + s);
    }
    
}
