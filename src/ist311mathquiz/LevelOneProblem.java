
package ist311mathquiz;


public class LevelOneProblem implements IMathProblem 
{
    //nums used differently in each method, + - * /
    int num1;
    int num2;
    
    private int answer;//Answer to the problem this class creates.
    private String problem;//String of the problem for output.
    
    
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
    
    
    public void add()
    {
        //Random number between 1 and 35.
        num1 = 1 + (int)(Math.random() * ((35 - 1) + 1));
        num2 = 1 + (int)(Math.random() * ((35 - 1) + 1));
        
        answer = num1 + num2;
        problem = num1 + " + " + num2;
    }
    public void subtract()
    {
        //random 10-20
        num1 = 1 + (int)(Math.random() * ((20 - 10) + 10));
        
        do
        {
        //Random 1-15
        num2 = 1 + (int)(Math.random() * ((15 - 1) + 1));
        //Repeat if num2 is larger.
        }while(num2 > num1);
        
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
        //Random number between 2 and 9.
        num1 = 2 +(int)(Math.random() * ((9 - 2) + 1));
        //This makes sure num1 is divisible by num2.
        num2 = num1 *  (2 + ((int)(Math.random() * ((9 - 2) + 1))));
        
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
