import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value n for the number
        System.out.print("n = ");
        //Declare variable of type double and read it from the keyboard
        double n = sc.nextDouble();

        //Display the message for the result, containing the value returned in the method
        System.out.print("The new number is " + doubleToInt(n));
    }

    //Define the method for converting the double into an integer
    static int doubleToInt(double n) {
        //Declare variable of type int, which will be the integer value after casting
        int m = (int) n;
        //Return the value of n after casting
        return m;

        //Alternate version for the method
        //1. No need to declare int m
        //2. Simply write 'return (int) n'
    }
}