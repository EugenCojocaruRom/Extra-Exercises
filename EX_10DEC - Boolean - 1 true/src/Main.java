import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display val1 for the first boolean value
        System.out.print("val1 = ");
        //Declare variable of type boolean and read it from the keyboard
        boolean val1 = sc.nextBoolean();
        //Display val2 for the second boolean value
        System.out.print("val2 = ");
        //Declare variable of type boolean and read it from the keyboard
        boolean val2 = sc.nextBoolean();
        //Display val3 for the third boolean value
        System.out.print("val3 = ");
        //Declare variable of type boolean and read it from the keyboard
        boolean val3 = sc.nextBoolean();

        //Display the result retrieved by the method
        System.out.print("The result is: " + oneIsTrue(val1, val2, val3));

    }

    //Define the method for checking if at least one boolean value is 'true'
    static boolean oneIsTrue(boolean val1, boolean val2, boolean val3) {
        //Set the condition for checking if at least one boolean value is 'true'
        if (val1 == true || val2 == true || val3 == true) {
            //Return 'true' if the condition is satisfied
            return true;
        }
        else {
            //Return 'false' in any other case
            return false;
        }
    }
}