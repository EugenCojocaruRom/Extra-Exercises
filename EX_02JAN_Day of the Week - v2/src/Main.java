import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display message for entering teh day of the week
        System.out.print("Enter the day of the week: ");
        //Declare variable 'day' of type string and read it from the keyboard
        String day = sc.nextLine();

        //Method for identifying the number of the day in the week
        System.out.println("This is day number " + dayOfWeek(day) + " of the week");
    }

    //Define method for identifying the number of the day in the week
    static int dayOfWeek(String day) {
        //Declare variable of type string for converting the name of the day to lowercase, irrespective of any capitalization
        String dayOfTheWeek = day.toLowerCase(); //String dayOfTheWeek = day.toUpperCase() --> for converting the name of the day to uppercase
        //Set the switch statement for matching the day with the number
        switch (dayOfTheWeek) {
            case "luni":
                return 1;
            case "marti":
                return 2;
            case "miercuri":
                return 3;
            case "joi":
                return 4;
            case "vineri":
                return 5;
            case "sambata":
                return 6;
            case "duminica":
                return 7;
            default:
                return -1;
        }
    }
}