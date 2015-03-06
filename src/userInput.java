
/**
 *Access Code 2.1
 *Madelyn Tavarez
 * Asking for Info
 * This class prompts the user to enter his Name, Age and Income
 * Credit to John Gomez Github:lighterletter
 */
    import java.util.Scanner;

    public class userInput {

        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Hello What is Your name?!");
            String something= keyboard.next();
            System.out.println(something);
            System.out.println("Hi " + something +"! I am Madelyn. How old are you?");
            int age= keyboard.nextInt();
            System.out.println("Oh Wow, Just "+ age+" SOOOO Young!!! You must not make ALOT of money! How much do you make?!");
            double money= keyboard.nextDouble();
            System.out.println("Just " +money+ "?!!! Wow you must be hungry all the time in this city!");
        }

}
