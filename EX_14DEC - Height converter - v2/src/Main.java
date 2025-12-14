import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display the message for entering the height in centimeters
        System.out.print("Enter your height in centimeters: ");
        //Declare variable 'cm' of type int for centimeters and read it from the keyboard
        int cm  = sc.nextInt();

        //Display the message containing the result in feet and inches, retrieved by calling the method
        cmToFeetAndInches(cm);
    }

    //Define the method for converting centimeters into feet and inches
    static int cmToFeetAndInches(int cm) {
        //Convert centimeters to inches, rounding the result to the nearest integer
        double inches = Math.round(cm / 2.54);
        //Convert inches to feet
        int feet = (int) (inches / 12);
        //Declare variable of type int to retrieve the remainder of the division to 12 (cast to int)
        int extraInches = (int) (inches % 12);
        //Set the conditions for returning the number of feet
        if (inches % 12 == 0) {
            System.out.println(feet + " feet, " + "0 inches");
            return feet;
        //Set the condition for returning the number of inches
        } else if (inches % 12 != 0) {
            System.out.println(feet + " feet, " + extraInches + " inches");
            return extraInches;
        }
        return feet;
    }
}