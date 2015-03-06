/**
 * Created by John Gomez Github:lighterletter on 3/5/15.
 * PairCode credit to Madelyn Tavarez  Github:Madelyntav
 * Access code 2.1
 * This class calculates user BMI.
 */

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        double height;
        double weight;
        double answer;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your height? (in):");
        height = keyboard.nextDouble();
        System.out.println("What is your weight? (lbs):");
        weight = keyboard.nextDouble();
        answer = ((weight/(height*height)) *703);
        System.out.println("Your BMI is:" + answer );



    }
}
