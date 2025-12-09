import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value x for the number
        System.out.print("x = ");
        //Declare variable of type double and read it from the keyboard
        double x = sc.nextDouble();

        //Display the message containing the result of the operation, as retrieved by the called method
        System.out.print(x + " squared is " + squareDouble(x));
    }

    //Define the method for computing the squared value of the given number
    static double squareDouble(double x) {
        //Return the value of the squared number
        return Math.pow(x, 2.0);
    }
}