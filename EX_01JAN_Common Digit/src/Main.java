import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display the message for entering the 2-digit numbers
        System.out.println("Enter the 2-digit numbers");
        //Display value x for the first 2-digit number
        System.out.print("x = ");
        //Declare variable 'x' of type int and read it from the keyboard
        int x = sc.nextInt();
        //Display value y for the second 2-digit number
        System.out.print("y = ");
        //Declare variable 'y' of type int and read it from the keyboard
        int y = sc.nextInt();

        //Display the message for confirming that the 2 numbers have a common digit
        System.out.println("The 2 numbers have a digit in common: " + commonDigit(x, y));
    }

    //Define method for checking that the 2 numbers have a common digit
    static boolean commonDigit(int x, int y) {
        //Declare variables for extracting the 2 digits of x and y
        int x1 = x / 10;
        int x2 = x % 10;
        int y1 = y / 10;
        int y2 = y % 10;
        //Set the condition for checking that there are 2 common digits
        if (x1 == y1 || x2 == y2 || x1 == y2 || x2 == y1) {
            return true;
        }
        return false;
    }
}