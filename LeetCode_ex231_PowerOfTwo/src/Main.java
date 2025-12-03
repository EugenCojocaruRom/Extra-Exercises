import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Given an integer n, return 'true' if it is a power of two. Otherwise, return 'false'.
        An integer n is a power of two, if there exists an integer x such that n == 2^x. */

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value n
        System.out.print("n = ");
        //Declare variable n of type int and read it from the keyboard
        int n = sc.nextInt();
        //Declare boolean 'isPowerOfTwo' with default value 'false'
        boolean isPowerOfTwo = false;
        //Set condition to check if 'n' is greater than 0 --> 0 and negative numbers cannot be powers of 2
        if (n > 0) {
            //Set 'while' loop --> when the remainder of division of 'n' by 2 is strictly equal to 0...
            while (n % 2 == 0) {
                //...n can be divided repeatedly until the final result gets to 1, proving that 'n' is a power of 2
                n /= 2;
            }
            //In the same loop, check if 'n' (i.e. the final result of the division by 2) is equal to 1
            if (n == 1) {
                //If the value is 1, return 'true' --> 'n' is a power of 2
                isPowerOfTwo = true;
            //If the final result value is other than 1, 'n' is not a power of 2
            } else {
                //Return 'false' when n is not equal to 1
                isPowerOfTwo = false;
            }
        }
        //Display the message with the value 'true' / 'false'
        System.out.print("Is power of two: " + isPowerOfTwo);
    }
}