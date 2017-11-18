
package problems;

 /**
 * instances represent a level 2 problem.
  */
public class LevelTwoProblem extends MathProblem
{
    /**
     * Level 2 addition problem.
     */
    @Override
    public void add()
    {
        //Random number between 5 and 30.
        num1 = 5 + (int)(Math.random() * ((30 - 5) + 1));
        num2 = 5 + (int)(Math.random() * ((30 - 5) + 1));
        
        answer = num1 + num2;
        problem = num1 + " + " + num2;
    }
    
    /**
     * Level 2 subtraction problem.
     */
    @Override
    public void subtract()
    {   //num between 10-40.
        num1 = 10 + (int)(Math.random() * ((40 - 10) + 1));
        
        do
        {//num between 5-30. will be lower on average than num1
        num2 = 5 + (int)(Math.random() * ((30 - 5) + 1));
        //Repeat if num2 is larger.
        }while(num2 > num1);
        
        answer = num1 - num2;
        problem = num1 + " - " + num2;
    }
    
    /**
     *Level 2 multiplication problem.
     */
    @Override
    public void multiply()
    {
        //Random num between 2 and 10.
        num1 = 2 + (int)(Math.random() * ((10 - 2) + 1));
        //Random num between 8 and 15.
        num2 = 8 + (int)(Math.random() * ((15 - 8) + 1));
        
        answer = num1 * num2;
        problem = num1 + " x " + num2;
    }
    
    /**
     * Level 2 division problem.
     */
    @Override
    public void divide()
    {
        //Random number between 1 and 10.
        num1 = 1 + (int)(Math.random() * ((10 - 1) + 1));
        //This makes sure num1 is divisible by num2. Random 3-15
        num2 = num1 *  (3 + ((int)(Math.random() * ((15 - 3) + 1))));
        
        answer = num2 / num1;
        problem = num2 + " / " + num1;
    }
}
