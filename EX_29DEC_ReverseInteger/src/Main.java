import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value 'n' for the integer
        System.out.print("n = ");
        //Declare variable 'n' of type int and read it from the keyboard
        int n = sc.nextInt();

        //Display the reversed integer
        System.out.println("The reversed value is " + reversedInt(n));
    }

    //Define method for reversing the int value
    static int reversedInt(int n) {
        //Declare variable 'rev' of type int and initialize it
        int rev = 0;
        //Declare variable 'rem' for the remainder of the division of n by 10
        int rem;
        //Set the condition for positive values of n
        while (n > 0) {
            //Set the value of rem as the remainder of the division of n by 10
            rem = n % 10;
            //Set the value of rev as the sum of rev multiplied by 10, to which the value of rem is added
            rev = (rev * 10) + rem;
            //Continue dividing n to 10 until the division is no longer possible
            n = n / 10;
        }
        //Return the reversed value
        return rev;
    }
}