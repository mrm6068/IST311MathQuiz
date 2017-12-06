package ist311mathquiz;

public class MathQuizDriver {

    public static void main(String[] args) {
        boolean nextLevel = false;//Holds whether user will move on.
        MathQuiz mathQuiz = new MathQuiz();//Represents this entire quiz.
        MenuDisplay display = new MenuDisplay();
        UserInput user1 = new UserInput();
        display.DisplayIntro();
        display.UserInfo();
        char again = 'Y';

        //Instantiate level one.
        Level levelOne = new Level(1);

        System.out.println("\n--LEVEL ONE--\n");

        //Start level one. Returns false if user doesn't pass level.
        nextLevel = levelOne.playLevel();

        //Add level score to total score.
        mathQuiz.setScore(mathQuiz.getScore() + levelOne.getLevelScore());

        //Output score.
        System.out.println("\nTotal Score: " + mathQuiz.getScore());

        //If level one was not passed...
        if (!nextLevel) {
            System.out.println("\nGame Over");
            System.out.println("Restart? (Y/N)");

            if (again == user1.getResponse()) {
                System.out.println("Get ready to start Level 1 again.");
                nextLevel = levelOne.playLevel();
                mathQuiz.setScore(mathQuiz.getScore() + levelOne.getLevelScore());

                //Output score.
                System.out.println("\nTotal Score: " + mathQuiz.getScore());
            }
            System.out.println("Goodbye!");
            System.exit(0);//End program.
        }

        System.out.println("\n--LEVEL TWO--\n");

        Level levelTwo = new Level(2);//Instantiate level two.
        nextLevel = levelTwo.playLevel();//Begin level two.

        //Add level score to total score.
        mathQuiz.setScore(mathQuiz.getScore() + levelTwo.getLevelScore());

        //Output score.
        System.out.println("\nTotal Score: " + mathQuiz.getScore());

        //If level two was not passed...
        if (!nextLevel) {
            System.out.println("\nGame Over");
            System.exit(0);//End program.
        }

        System.out.println("\n--BONUS LEVEL ONE--\n");

        //Play bonus one.
        BonusLevel bonusOne = new BonusLevel();
        bonusOne.playBonusOne();

        //Add bonus level score to total score.
        mathQuiz.setScore(mathQuiz.getScore() + bonusOne.getLevelScore());

        //Output score.
        System.out.println("\nTotal Score: " + mathQuiz.getScore());

        System.out.println("\n--LEVEL THREE--\n");

        Level levelThree = new Level(3);//Instantiate level three.
        nextLevel = levelThree.playLevel();//Begin level three.

        //Add level score to total score.
        mathQuiz.setScore(mathQuiz.getScore() + levelThree.getLevelScore());

        //Output score.
        System.out.println("\nTotal Score: " + mathQuiz.getScore());

        //If level one was not passed...
        if (!nextLevel) {
            System.out.println("\nGame Over");
            System.exit(0);//End program.
        }

    }

}
