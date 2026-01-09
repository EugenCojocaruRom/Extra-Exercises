import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Declare 'random' object for generating the random number
        Random rand = new Random();
        //Generate a random number between 1 and 50
        int number = rand.nextInt(50) + 1; //add +1 to also include 50
        //Declare variable of type int for the number entered by the player (guess) and initialize it
        int guess = 0;
        //Declare variable of type int (counter) and initialize it
        int counter = 0;
        //Display message for the player
        System.out.println("Guess a number between 1 and 50");
        //Loop until the player guesses the number
        while (guess != number) {
            //Prompt the player to enter a number
            System.out.print("Enter your guess: ");
            //Read the number from the keyboard
            guess = sc.nextInt();
            //Set the conditions for comparing the number entered by the player to the random generated one
            if (guess < number) {
                System.out.println("The number you entered is too low");
                //Increment the counter
                counter++;
            }
            else if (guess > number) {
                System.out.println("The number you entered is too high");
                counter++;
            }
            else {
                System.out.println("The number you entered is correct");
                counter++;
            }
        }
        //Display the number of tries it took to guess the number
        System.out.println("You guessed the number in " + counter + " tries.");
    }
}