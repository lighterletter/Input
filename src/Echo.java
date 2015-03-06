/**
 * Created by John Gomez Github:lighterletter on 3/5/15.
 * PairCode credit to Madelyn Tavarez  Github:Madelyntav
 * Access code 2.1
 * This class receives user input and and repeats it back to them.
 *
 */

import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Tell me something you love!");
        String something = keyboard.nextLine();

        System.out.println("Now tell me something you hate!");
        String some = keyboard.nextLine();

        System.out.println("Now give me your favorite number");
        int Num = keyboard.nextInt();
        System.out.println("Last, tell me your age!");
        int myNum = keyboard.nextInt();
        System.out.println("Wasn't that fun!?");

    }
}
