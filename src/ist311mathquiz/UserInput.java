/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist311mathquiz;
import java.util.Scanner;

/**
 *
 * @author Matthew Baun
 */
public class UserInput {
    
    static void getAnswer(){
        System.out.println("Enter the answer: ");
        Scanner input = new Scanner(System.in);
        double guess = input.nextDouble();
    }
    
    public static void main(String[] args){
        getAnswer();
    }
}
