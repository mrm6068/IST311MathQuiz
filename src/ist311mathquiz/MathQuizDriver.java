package ist311mathquiz;

import Levels.Level;
import Levels.BonusLevel;
import Utilities.UserInput;
import Utilities.Timer;
/**
 * 
 * @author Matthew Baun <mwb5755>
 * This is the driver/testing class that runs the program
 * that generates timed algebra questions for students to learn from.
 * It goes through 2 levels, a bonus level, 2 more levels,
 * and a final bonus level
 */
public class MathQuizDriver {

    public static void main(String[] args) {
        boolean nextLevel = false;//Holds whether user will move on.
        MathQuiz mathQuiz = new MathQuiz();//Represents this entire quiz.
        MenuDisplay display = new MenuDisplay();
        display.DisplayIntro();
        display.UserInfo();

        //Instantiate level one.
        Level levelOne = new Level(1);
        Level quit = new Level(1);

        System.out.println("\n--LEVEL ONE--\n");

        Timer.countdown();//countdown to level start.

        //Start level one. Returns false if user doesn't pass level.
        nextLevel = levelOne.playLevel();

        //Add level score to total score.
        mathQuiz.setScore(mathQuiz.getScore() + levelOne.getLevelScore());

        //Output score.
        System.out.println("\nTotal Score: " + mathQuiz.getScore());

        //Exits the program if the user doesn't pass the level
        if (!nextLevel) {
            quit.gameOver();
        }

        System.out.println("\n--LEVEL TWO--\n");

        Timer.countdown();

        Level levelTwo = new Level(2);//Instantiate level two.
        nextLevel = levelTwo.playLevel();//Begin level two.

        //Add level score to total score.
        mathQuiz.setScore(mathQuiz.getScore() + levelTwo.getLevelScore());

        //Output score.
        System.out.println("\nTotal Score: " + mathQuiz.getScore());

        //Exits the program if the user doesn't pass the level
        if (!nextLevel) {
            quit.gameOver();
        }

        System.out.println("\n--BONUS LEVEL ONE--\n");

        Timer.countdown();

        //Play bonus one.
        BonusLevel bonusOne = new BonusLevel();
        bonusOne.playBonusOne();

        //Add bonus level score to total score.
        mathQuiz.setScore(mathQuiz.getScore() + bonusOne.getLevelScore());

        //Output score.
        System.out.println("\nTotal Score: " + mathQuiz.getScore());

        System.out.println("\n--LEVEL THREE--\n");

        Timer.countdown();

        Level levelThree = new Level(3);//Instantiate level three.
        nextLevel = levelThree.playLevel();//Begin level three.

        //Add level score to total score.
        mathQuiz.setScore(mathQuiz.getScore() + levelThree.getLevelScore());

        //Output score.
        System.out.println("\nTotal Score: " + mathQuiz.getScore());

        //Exits the program if the user doesn't pass the level
        if (!nextLevel) {
            quit.gameOver();
        }

    }

}
