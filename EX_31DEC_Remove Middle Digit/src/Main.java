import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display label for number to be entered
        System.out.print("Enter a 5 digit number: ");
        //Declare variable 'num' of type int and read it from the keyboard
        int n = sc.nextInt();

        //Display the message with the new number retrieved by calling the method
        System.out.println("The new number is: " + removeMiddleDigit(n));

    }

    //Define method for removing the middle digit
    static int removeMiddleDigit(int n) {
        return (n >= 10000 && n <= 99999) ? ((n / 1000) * 100 + (n % 100)) : -1;
    }
}