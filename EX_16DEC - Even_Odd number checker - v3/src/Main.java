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
            //Set the conditions for checking and that the number is even or odd
            String oddOrEven = (number % 2 == 0) ? (number + " -> even") : (number + " -> odd");
            //Display the label 'even' / 'odd' next to the number, depending on the condition that is satisfied
            System.out.println(oddOrEven);
        }
        //Other cases (number < 1 or number > 1000)
        else {
            //Display a message stating that the number entered is incorrect
            System.out.println("Invalid input. Try again.");
        }
    }
}