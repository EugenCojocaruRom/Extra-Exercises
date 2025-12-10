import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value str1 for the first string
        System.out.print("str1 = ");
        //Declare variable of type string and read it from the keyboard
        String str1 = sc.nextLine();
        //Display value str2 for the second string
        System.out.print("str2 = ");
        //Declare variable of type string and read it from the keyboard
        String str2 = sc.nextLine();

        //Display the message with the result of comparing the lengths of the 2 strings
        System.out.print("The two strings have the same length = " + sameLength(str1, str2));
    }

    //Define method for comparing the lengths of the 2 strings
    static boolean sameLength(String str1, String str2) {
        //Set the condition of equality between the lengths of the 2 strings
        if (str1.length() == str2.length()) {
            //Return 'true' if the condition above is satisfied
            return true;
        }
        else {
            //Return 'false' if the lengths are different
            return false;
        }
    }
}