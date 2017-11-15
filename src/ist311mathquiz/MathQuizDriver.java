
package ist311mathquiz;

public class MathQuizDriver 
{
    public static void main(String[] args) 
    {
        boolean nextLevel = false;//Holds whether user will move on.
        MathQuiz mathQuiz = new MathQuiz();//Represents this entire quiz.
         
        //Start level one.
        nextLevel = mathQuiz.levelOne();
        
        //If last level was passed...
        if(nextLevel)
        {
            nextLevel = mathQuiz.levelTwo();
        }
        
        
        
    }
  
}
