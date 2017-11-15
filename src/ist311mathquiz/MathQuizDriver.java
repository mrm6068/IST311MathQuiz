
package ist311mathquiz;

public class MathQuizDriver 
{
    public static void main(String[] args) 
    {
        boolean nextLevel = false;//Holds whether user will move on.
        MathQuiz mathQuiz = new MathQuiz();
         
        //Start level one.
        nextLevel = mathQuiz.levelOne();
        
        
        if(nextLevel)
        {
            nextLevel = mathQuiz.levelTwo();
        }
        
        
        
    }
  
}
