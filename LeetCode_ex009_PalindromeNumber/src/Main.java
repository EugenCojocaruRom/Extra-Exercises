import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value x
        System.out.print("x = ");
        //Declare variable 'x' of type long and read it from the keyboard
        long x = sc.nextLong();
        //Declare boolean 'isPalindrome' and set its default value to 'true'
        boolean isPalindrome = true;
        //Set condition for the number entered to not be less than 0
        if (x < 0) {
            //Return 'false' if the number is less than 0
            isPalindrome = false;
        }
        //Convert the number to String to be able to check its digits
        String str = Long.toString(x);
        //Declare variable 'n' as the length of String 'str'
        int n = str.length();
        //Loop through the String 'str' from i = 0 to half of the length of 'str', incrementing i by 1;
        for (int i = 0; i < n / 2; ++i) {
            /*Set the condition for comparing the characters of the string
            starting from i from one end and with i-1 from the other end*/
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            //Display message that the number is a palindrome
            System.out.print(true);
        } else {
            //Display message that the number is not a palindrome
            System.out.print(false);
        }
    }
}