import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display label for entering the number
        System.out.print("Your number is: ");
        //Declare variable of type int for the number
        int number = sc.nextInt();
        //Set the condition for checking if the number is positive and in the interval 1 to 1000
        if (number >= 1 && number <=1000) {
            //Set the condition for checking that the number is even
            if (number % 2 == 0) {
                //Display the number and value 0 if the number is even
                System.out.println(number + " -> 0");
            }
            //Set the condition for checking that the number is odd
            else {
                //Display the number and value 1 if the number is odd
                System.out.println(number + " -> 1");
            }
        }
        //Other cases (number < 1 or number > 1000)
        else {
            //Display a message stating that the number entered is incorrect
            System.out.println("Invalid input. Try again.");
        }
    }
}