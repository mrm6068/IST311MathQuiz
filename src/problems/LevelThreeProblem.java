
package problems;

 /**
 * instances represent a level 3 problem.
  */
public class LevelThreeProblem extends MathProblem
{
    /**
     * Level 3 addition problem.
     */
    @Override
    public void add()
    {
        //Random number between 15 and 300.
        num1 = 15 + (int)(Math.random() * ((300 - 15) + 1));
        num2 = 15 + (int)(Math.random() * ((300 - 15) + 1));
        
        answer = num1 + num2;
        problem = num1 + " + " + num2;
    }
    
    /**
     * Level 3 subtraction problem.
     */
    @Override
    public void subtract()
    {   //num between 10-150.
        num1 = 10 + (int)(Math.random() * ((150 - 10) + 1));
        
        do
        {//num between 10-100. will be lower on average than num1
        num2 = 10 + (int)(Math.random() * ((100 - 10) + 1));
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
        //Random num between 2 and 10.
        num1 = 2 + (int)(Math.random() * ((10 - 2) + 1));
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
        num1 = 5 + (int)(Math.random() * ((15 - 5) + 1));
        //This makes sure num1 is divisible by num2. Random 3-20
        num2 = num1 *  (3 + ((int)(Math.random() * ((20 - 3) + 1))));
        
        answer = num2 / num1;
        problem = num2 + " / " + num1;
    }
}