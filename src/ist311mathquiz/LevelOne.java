
package ist311mathquiz;

/**
 *
 * @author Mike0_000
 */
public class LevelOne implements IMathProblem 
{
    int num1;
    int num2;
    private int answer;
    private String problem;
    
    
    //This method is called to randomly choose addition, subtraction, etc.
    public void randomQuestion()
    {
        //Random number between 1 and 4
        int randomQuestion = 1 + (int)(Math.random() * ((4 - 1) + 1));
        
        switch(randomQuestion)
        {
            case 1: add(); break;
            case 2: subtract(); break;
            case 3: multiply(); break;
            case 4: divide(); break;
            default: System.out.println("Invalid");
        }
    }
    public void add()
    {
        num1 = 1 + (int)(Math.random() * ((35 - 1) + 1));
        num2 = 1 + (int)(Math.random() * ((35 - 1) + 1));
        
        answer = num1 + num2;
        problem = num1 + " + " + num2;
    }
    public void subtract()
    {
        num1 = 1 + (int)(Math.random() * ((35 - 1) + 1));
        
        //Makes sure second number is smaller.
        while(num2 > num1)
        {
        num2 = 1 + (int)(Math.random() * ((35 - 1) + 1));
        }
        
        answer = num1 - num2;
        problem = num1 + " - " + num2;
    }
    public void multiply()
    {
        //Random nums between 2 and 11
        num1 = 2 + (int)(Math.random() * ((11 - 2) + 1));
        num2 = 2 + (int)(Math.random() * ((11 - 2) + 1));
        
        answer = num1 * num2;
        problem = num1 + " x " + num2;
    }
    public void divide()
    {
        num1 = (int)(Math.random() * ((11 - 2) + 1));
        num2 = num1 *  2 + ((int)(Math.random() * ((11 - 2) + 1)));
        
        answer = num2 / num1;
        problem = num2 + " / " + num1;
    }
    
    public String getProblem()
    {
        return problem;
    }
    
    public int getAnswer()
    {
        return answer;
    }
}
