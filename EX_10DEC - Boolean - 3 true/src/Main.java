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

        //Display the result returned by the method
        System.out.print("The result is: " + allThreeTrue(val1, val2, val3));

    }

    //Define the method for checking if all 3 values are 'true'
    static boolean allThreeTrue(boolean val1, boolean val2, boolean val3) {
        //Set the condition for checking if all 3 boolean values are 'true'
        if (val1 == true && val2 == true && val3 == true) { // or (val1 == val2 == val3 == true)
            //Return 'true' if the condition is satisfied
            return true;
        }
        else {
            //Return 'false' in any other case
            return false;
        }
    }
}