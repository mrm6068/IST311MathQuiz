package ist311mathquiz;

import java.util.Scanner;

/**
 *
 * @author Adrian Galecki
 */
public class MenuDisplay {

    private String playerName;
    private int playerAge;

    
    public String getName() {
        return playerName.substring(0,1).toUpperCase() + playerName.substring(1);
    }

    public void setName(String name) {
        this.playerName = name;
    }

    public int getAge() {
        return playerAge;
    }

    public void setAge(int age) {
        this.playerAge = age;
    }
    
    public void DisplayIntro(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("--=-- Math Quiz --=--");
        System.out.println("\nThere are 4 levels of math questions" +
                " plus bonus levels if you complete each level with a score" +
                " of higher than 400\n");
        System.out.print("Enter player name: ");
        playerName = input.nextLine();
        setName(playerName);
        System.out.print("\nEnter player age: ");
        playerAge = input.nextInt();
        setAge(playerAge);
    }
    public void UserInfo(){
        System.out.println("\nLet's get started");
        System.out.println("\n---PLAYER---");
        System.out.println("| " + getName() + " | " + getAge() + " |" );
    }
    

}

