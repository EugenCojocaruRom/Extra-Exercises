import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner scanner = new Scanner(System.in);
        //Display label for hours
        System.out.print("H = ");
        //Declare variable hours of type int
        int hours;
        //Read value hours from keyboard
        hours = scanner.nextInt();
        //Display label for minutes
        System.out.print("M = ");
        //Declare variable minutes of type int
        int minutes;
        //Read value sideB from keyboard
        minutes = scanner.nextInt();
        //Display label for seconds
        System.out.print("S = ");
        //Declare variable seconds of type int
        int seconds;
        //Read value sideC from keyboard
        seconds = scanner. nextInt();


        //Method for computing the milliseconds
        milliseconds(hours, minutes, seconds);
    }

    //Define method for computing the number of milliseconds
    static void milliseconds(int hours, int minutes, int seconds) {
        //Check that the values are valid
        if ((hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59) && (seconds >= 0 && seconds <= 59)) {
            //Convert the given values into milliseconds
            int millis = ((hours * 3600 + minutes * 60 + seconds) * 1000);
            //Display the message with the result
            System.out.println("The number of milliseconds is " + millis);
        } else {
            System.out.println("Incorrect values");
        }
    }
}