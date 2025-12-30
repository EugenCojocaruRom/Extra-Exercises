import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Display label a for the first number
        System.out.print("a = ");
        //Declare variable a of type int and read it from the keyboard
        int a = sc.nextInt();
        //Display label b for the first number
        System.out.print("b = ");
        //Declare variable b of type int and read it from the keyboard
        int b = sc.nextInt();

        //Method for checking which value is closer to 21
        closeTo21(a, b);
    }

    //Define method for checking which value is closer to 21
    static void closeTo21(int a, int b) {
        //Set the condition for returning the value of a
        if ((a <= 21) && ((a > b) || (b > 21))) {
            //Display the value of a
            System.out.println("The value is " + a);
        }
        //Set the condition for returning the value of b
        else if ((b <= 21) && ((b > a) || (a > 21))) {
            //Display the value of b
            System.out.println("The value is " + b);
        }
        //Set the condition for returning the value of a or b when a = b and a & b <= 21
        else if ((a == b) && (a <= 21) ) {
            //Display the value of a
            System.out.println("The value is " + a);
        }
        //Set the condition for returning 0 when both values are over 21
        else {
            //Display the value 0 (zero)
            System.out.println("The value is " + 0);
        }
    }
}