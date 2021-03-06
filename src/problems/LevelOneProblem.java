
package problems;

import problems.MathProblem;

/**
 * instances represent a level 1 problem.
  */
public class LevelOneProblem extends MathProblem 
{  
    /**
     * Level 1 addition problem.
     */
    @Override
    public void add()
    {
        //Random number between 1 and 15.
        num1 = 1 + (int)(Math.random() * ((15 - 1) + 1));
        num2 = 1 + (int)(Math.random() * ((15 - 1) + 1));
        
        answer = num1 + num2;
        problem = num1 + " + " + num2;
    }
    
    /**
     * Level 1 subtraction problem.
     */
    @Override
    public void subtract()
    {
        //random 5-15
        num1 = 5 + (int)(Math.random() * ((15 - 5) + 1));
        
        do
        {
        //Random 1-10
        num2 = 1 + (int)(Math.random() * ((10 - 1) + 1));
        //Repeat if num2 is larger.
        }while(num2 > num1);
        
        answer = num1 - num2;
        problem = num1 + " - " + num2;
    }
    
    /**
     * Level 1 multiplication problem.
     */
    @Override
    public void multiply()
    {
        //Random nums between 1 and 10
        num1 = 1 + (int)(Math.random() * ((10 - 1) + 1));
        num2 = 1 + (int)(Math.random() * ((10 - 1) + 1));
        
        answer = num1 * num2;
        problem = num1 + " x " + num2;
    }
    
    /**
     * Level 1 division problem.
     */
    @Override
    public void divide()
    {
        //Random number between 1 and 10.
        num1 = 1 +(int)(Math.random() * ((10 - 1) + 1));
        //This makes sure num1 is divisible by num2.
        num2 = num1 *  (1 + ((int)(Math.random() * ((10 - 1) + 1))));
        
        answer = num2 / num1;
        problem = num2 + " / " + num1;
    }
    
}
