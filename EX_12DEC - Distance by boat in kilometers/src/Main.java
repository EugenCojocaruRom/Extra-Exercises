import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner scanner = new Scanner(System.in);
        //Display the speed of the boat
        System.out.print("Enter the speed of the boat in knots: ");
        //Declare variable of type double for speed and read it from the keyboard
        double speed = scanner.nextDouble();
        //Display the number of hours the boat has been traveling
        System.out.print("Enter the hours: ");
        //Declare variable of type int for hours and read it from the keyboard
        int hoursTravel = scanner.nextInt();
        //Display the number of minutes the boat has been traveling
        System.out.print("Enter the minutes: ");
        //Declare variable of type int for minutes and read it from the keyboard
        int minutesTravel = scanner.nextInt();

        /*Display the message containing the hours, the minutes and the speed the boat has been traveling,
        and include the number of kilometers as returned by the method*/
        System.out.print("The boat made " + numberOfKilometers(speed, hoursTravel, minutesTravel) + " kilometers in " + hoursTravel +
                " hour(s) and " + minutesTravel + " minute(s), traveling at a speed of " + speed + " knots.");
    }

    //Define the method for calculating the number of kilometers at the given speed and in the given time
    static String numberOfKilometers(double speed, int hoursTravel, int minutesTravel) {
        //Declare constant of type double for equivalent of a nautical mile in meters (1 nautical mile = 1.852 km / 1852 m)
        final double nauticalMile = 1852;
        //Declare constant of type double for equivalent of an hour in minutes
        final int hour = 60;
        //Compute the speed in meters / minute
        double knot = nauticalMile / hour;
        //Convert the hours of travel into minutes
        int minutes = hoursTravel * hour;
        //Calculate the number of minutes of travel
        int totalMinutes = minutes + minutesTravel;
        //Compute the number of kilometers the boat has been traveling
        double kilometersTravel = (speed * knot * totalMinutes) / 1000;
        //Declare decimal format for trimming the number of decimals to just two
        DecimalFormat df = new DecimalFormat("0.0");
        //Return the result formatted to display no more than 2 decimals
        return df.format(kilometersTravel);
    }
}