
package ist311mathquiz;

/**
 *
 * Implementing classes will represent problems of different difficulty levels.
 */
public interface IMathProblem 
{
    //Each class will implement these differently.
    public void add();
    public void subtract();
    public void multiply();
    public void divide();
}
