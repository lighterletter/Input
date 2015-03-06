import java.util.Scanner;

/**
 * Created by John Gomez Github:lighterletter on 3/5/15.
 * PairCode credit to Madelyn Tavarez  Github:Madelyntav
 * Access code 2.1
 * This class calculates adds the users numbers and outputs them divided by two.
 */
public class SmartCalculator {
    public static void main(String[] args) {
        double firstNum;
        double secondNum;
        double thirdNum;
        double answer;
        Scanner input = new Scanner(System.in);

        System.out.println("What is your first number?");
        firstNum = input.nextDouble();

        System.out.println("What is your second number?");
        secondNum = input.nextDouble();

        System.out.println("What is your final number?");
        thirdNum = input.nextDouble();

        answer = (firstNum + secondNum + thirdNum) /2;
        System.out.println("( " + firstNum + " + " + secondNum + " + " + thirdNum + " ) /2 is..." + answer);


    }
}

