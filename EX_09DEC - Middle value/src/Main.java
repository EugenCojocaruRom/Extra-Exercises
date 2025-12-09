import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value x for the first number
        System.out.print("x = ");
        //Declare variable of type double and read it from the keyboard
        double x = sc.nextDouble();
        //Display value min for the second number
        System.out.print("min = ");
        //Declare variable of type double and read it from the keyboard
        double min = sc.nextDouble();
        //Display value max for the third number
        System.out.print("max = ");
        //Declare variable of type double and read it from the keyboard
        double max = sc.nextDouble();

        //Display the message for the value in the middle
        System.out.print("Number x is between min and max = " + isMiddle(x, min, max));
    }

    //Define method for checking if x is between min and max
    static boolean isMiddle(double x, double min, double max) {
        //Define variable of type boolean to confirm the position of x; set as 'true'
        boolean mid = true;
        //Define condition to check the position of x
        if (x >= min && x <= max) {
            //Return 'true' if the condition is satisfied
            return true;
        } else {
            //Return 'false' in any other case
            return false;
        }
    }
}