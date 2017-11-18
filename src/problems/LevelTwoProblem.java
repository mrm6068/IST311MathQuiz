
package problems;

//import problems.MathProblem;

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
        //Random number between 15 and 40.
        num1 = 15 + (int)(Math.random() * ((40 - 15) + 1));
        num2 = 15 + (int)(Math.random() * ((40 - 15) + 1));
        
        answer = num1 + num2;
        problem = num1 + " + " + num2;
    }
    
    /**
     * Level 2 subtraction problem.
     */
    @Override
    public void subtract()
    {   //num between 20-50.
        num1 = 20 + (int)(Math.random() * ((50 - 20) + 1));
        
        do
        {//num between 15-40. will be lower on average than num1
        num2 = 15 + (int)(Math.random() * ((40 - 15) + 1));
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
        //Random nums between 3 and 20.
        num1 = 3 + (int)(Math.random() * ((20 - 3) + 1));
        num2 = 3 + (int)(Math.random() * ((20 - 3) + 1));
        
        answer = num1 * num2;
        problem = num1 + " x " + num2;
    }
    
    /**
     * Level 2 division problem.
     */
    @Override
    public void divide()
    {
        //Random number between 3 and 15.
        num1 = 3 + (int)(Math.random() * ((15 - 3) + 1));
        //This makes sure num1 is divisible by num2.
        num2 = num1 *  (3 + ((int)(Math.random() * ((15 - 3) + 1))));
        
        answer = num2 / num1;
        problem = num2 + " / " + num1;
    }
}
