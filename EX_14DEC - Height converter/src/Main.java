import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner scanner = new Scanner(System.in);
        //Display the message for entering the height in feet
        System.out.print("Enter your height in feet: ");
        //Declare variable of type int for feet and read it from the keyboard
        int feet  = scanner.nextInt();
        //Display the message for entering the height in inches
        System.out.print("Enter your height in inches: ");
        //Declare variable of type int for inches and read it from the keyboard
        int inches = scanner.nextInt();

        //Display the message containing the result in centimeters, retrieved by calling the method
        System.out.print("Your height in centimeters is: " + convertToCentimeters(feet, inches) + " cm");
    }

    //Define method for converting feet and inches into centimeters
    static int convertToCentimeters(int feet, int inches){
        //Declare variable of type int for converting feet into inches
        int feetToInches = feet * 12;
        //Declare variable of type int for calculating the total inches
        int totalInches = feetToInches + inches;
        //Declare variable of type double for converting inches into centimeters
        double inchesToCentimeters = totalInches * 2.54;
        //Declare variable of type int for converting the double value into an int
        int centimeters = (int) (inchesToCentimeters);
        //Return the value for 'centimeters'
        return centimeters;
    }
}