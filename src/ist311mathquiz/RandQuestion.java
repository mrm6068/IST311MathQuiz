package ist311mathquiz;

import java.util.Random;
/**
 * @author Arnold Adu-Darko
 */
public class RandQuestion {
    public static void main(String args[])
    {
        int a[] = {10};
        int array = pullRandomQuestion(a);
    }
    
    public static int pullRandomQuestion(int[] array)
            {
                int rand = new Random().nextInt(array.length);
                return array[rand];
            }
}
