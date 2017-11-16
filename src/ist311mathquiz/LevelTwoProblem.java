
package ist311mathquiz;



public class LevelTwoProblem extends MathProblem
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
            default: System.out.println("Invalid");
        }
    }
    
    public void add()
    {
        //Random number between 20 and 70.
        num1 = 20 + (int)(Math.random() * ((70 - 20) + 1));
        num2 = 20 + (int)(Math.random() * ((70 - 20) + 1));
        
        answer = num1 + num2;
        problem = num1 + " + " + num2;
    }
    public void subtract()
    {   //num between 50-100.
        num1 = 11 + (int)(Math.random() * ((80 - 11) + 1));
        
        do
        {//num between 30-75. will be lower on average than num1
        num2 = 11 + (int)(Math.random() * ((70 - 11) + 1));
        //Repeat if num2 is larger.
        }while(num2 > num1);
        
        answer = num1 - num2;
        problem = num1 + " - " + num2;
    }
    public void multiply()
    {
        //Random nums between 8 and 20.
        num1 = 8 + (int)(Math.random() * ((20 - 8) + 1));
        num2 = 8 + (int)(Math.random() * ((20 - 8) + 1));
        
        answer = num1 * num2;
        problem = num1 + " x " + num2;
    }
    public void divide()
    {
        //Random number between 8 and 20.
        num1 = 8 + (int)(Math.random() * ((20 - 8) + 1));
        //This makes sure num1 is divisible by num2.
        num2 = num1 *  (8 + ((int)(Math.random() * ((20 - 8) + 1))));
        
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
