
package ist311mathquiz;

public class MathQuizDriver 
{
    public static void main(String[] args) 
    {
        boolean nextLevel = false;//Holds whether user will move on.
        MathQuiz mathQuiz = new MathQuiz();//Represents this entire quiz.
         
        //Instantiate level one.
        LevelOne levelOne = new LevelOne();
        
        //Start level one. Returns false if user doesn't pass level.
        nextLevel = levelOne.playLevelOne();
        
        //Add level score to total score.
        mathQuiz.setScore(mathQuiz.getScore() + levelOne.getLevelScore());
        
        //Output score.
        System.out.println("\nTotal Score: " + mathQuiz.getScore());
        
        //If last level was passed...
        if(nextLevel)
        {
            LevelTwo levelTwo = new LevelTwo();//Instantiate level two.
            nextLevel = levelTwo.playLevelTwo();//Begin level two.
        }
        else
        {   //No level two, level one failed.
            System.out.println("Game Over");
            System.exit(0);//End program.
        }
        
        if(nextLevel)
        {
            //will add level three when created
            System.out.println("You Win!!");
        }
        else
        {   //No level two, level one failed.
            System.out.println("Game Over");
            System.exit(0);//End program.
        }
        
    
    }
  
}
