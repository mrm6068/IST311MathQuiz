
package ist311mathquiz;

/**
 *
 * Implementing classes will represent problems of different difficulty levels.
 */
public abstract class MathProblem 
{
    private int answer;//Answer to the problem this class creates.
    private String problem;//String of the problem for output.
    
    //nums used differently in each method, + - * /
    int num1;
    int num2;
    
    //This method is called to randomly choose addition, subtraction, etc.
    public void randomQuestion()
    {
        //Random number between 1 and 4
        int randomQuestion = 1 + (int)(Math.random() * ((4 - 1) + 1));
        
        //Chooses random question.
        switch(randomQuestion)
        {
            case 1: add(); break;
            case 2: subtract(); break;
            case 3: multiply(); break;
            case 4: divide(); break;
        }
    }
    public String getProblem()
    {
        return problem;
    }
    
    public int getAnswer()
    {
        return answer;
    }
    
    //Each class will implement these with different difficulty levels.
    public abstract void add();
    public abstract void subtract();
    public abstract void multiply();
    public abstract void divide();
}