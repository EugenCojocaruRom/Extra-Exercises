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
    static byte dayOfWeek(String day) {
        //Declare variable of type string for converting the name of the day to lowercase, irrespective of any capitalization
        String dayOfTheWeek = day.toLowerCase(); //String dayOfTheWeek = day.toUpperCase() --> for converting the name of the day to uppercase
        //Declare variable 'dayNumber' of type byte
        byte dayNumber;
        //Set the switch statement for matching the day with the number
        switch (dayOfTheWeek) {
            case "luni":
                dayNumber = 1;
                break;
            case "marti":
                dayNumber = 2;
                break;
            case "miercuri":
                dayNumber = 3;
                break;
            case "joi":
                dayNumber = 4;
                break;
            case "vineri":
                dayNumber = 5;
                break;
            case "sambata":
                dayNumber = 6;
                break;
            case "duminica":
                dayNumber = 7;
                break;
            default:
                dayNumber = -1;
        }
        return dayNumber;
    }
}