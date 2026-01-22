import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt to enter a number
        System.out.print("Enter a number: ");
        //Declare variable of type int and read it from the keyboard
        int number = sc.nextInt();

        //Method for countdown
        countdown(number, sc);
    }

    //Define method for countdown
    public static void countdown(int number, Scanner sc) {
        //Display message
        System.out.println("Starting countdown...");
        //Enter the loop
        do {
            //Display the current number
            System.out.println("The number is: " + number);
            //Set condition for even number
            if (number % 2 == 0) {
                //Divide the number by to if it is even
                number /= 2;
            }
            //Set condition for odd number
            else {
                //Subtract 1 it it is odd
                number -= 1;
            }
        }
        //Execute the loop until it reaches 1
        while (number > 1);
        //Display the final number
        System.out.println("The final number is: " + number);
        //Display message when the countdown finishes
        System.out.println("Countdown finished!");
    }
}