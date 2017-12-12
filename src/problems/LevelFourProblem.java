package problems;

/**
 *
 * @author Arnold Adu-Darko
 */
public class LevelFourProblem extends MathProblem{
    @Override
    public void add()
    {
        //Random number between 50 and 1000.
        num1 = 50 + (int)(Math.random() * ((1000 - 50) + 1));
        num2 = 50 + (int)(Math.random() * ((1000 - 50) + 1));
        
        answer = num1 + num2;
        problem = num1 + " + " + num2;
    }
    
    /**
     * Level 3 subtraction problem.
     */
    @Override
    public void subtract()
    {   //num between 50-500.
        num1 = 50 + (int)(Math.random() * ((500 - 50) + 1));
        
        do
        {//num between 50-350. will be lower on average than num1
        num2 = 50 + (int)(Math.random() * ((350 - 50) + 1));
        //Repeat if num2 is larger.
        }while(num2 > num1);
        
        answer = num1 - num2;
        problem = num1 + " - " + num2;
    }
    
    /**
     *Level 3 multiplication problem.
     */
    @Override
    public void multiply()
    {
        //Random num between 11 and 20.
        num1 = 11 + (int)(Math.random() * ((20 - 11) + 1));
        //Random num between 11 and 20.
        num2 = 11 + (int)(Math.random() * ((20 - 11) + 1));
        
        answer = num1 * num2;
        problem = num1 + " x " + num2;
    }
    
    /**
     * Level 3 division problem.
     */
    @Override
    public void divide()
    {
        //Random number between 5 and 15.
        num1 = 7 + (int)(Math.random() * ((20 - 7) + 1));
        //This makes sure num1 is divisible by num2. Random 3-20
        num2 = num1 *  (5 + ((int)(Math.random() * ((28 - 5) + 1))));
        
        answer = num2 / num1;
        problem = num2 + " / " + num1;
    }
}
   
