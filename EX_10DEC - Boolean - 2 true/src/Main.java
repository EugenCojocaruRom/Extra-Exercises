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
        System.out.print("The result is: " + twoTrue(val1, val2, val3));
    }

    //Define the method for checking if none of the 3 values is 'true'
    static boolean twoTrue(boolean val1, boolean val2, boolean val3) {
        //Set the conditions for checking that only two of the 3 boolean values are 'true'
        if (val1 == val2 == true && val3 == false) {
            //Return 'true' if the condition is satisfied
            return true;
        }
        else if (val2 == val3 == true && val1 == false) {
            //Return 'true' if the condition is satisfied
            return true;
        }
        else if (val1 == val3 == true && val2 == false) {
            //Return 'true' if the condition is satisfied
            return true;
        }
        else {
            //Return 'false' in any other case
            return false;
        }
    }
}