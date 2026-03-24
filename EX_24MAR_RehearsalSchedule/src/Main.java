import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Declare variable of type int
        int numberOfGroups;
        //Keep prompting the user until a valid number of groups is entered (1-5)
        do {
            //Display prompt - number of groups
            System.out.print("Enter the number of groups (1-5): ");
            //Read the variable from the keyboard
            numberOfGroups = sc.nextInt();
            //Set condition to check that the value entered is between 1 and 5
            if (numberOfGroups < 1 || numberOfGroups > 5) {
                //Display message in case the value is incorrect
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
            }
        }
        //Loop for as long as the value is incorrect
        while (numberOfGroups < 1 || numberOfGroups > 5);
        //Declare variable of type int and read it from the keyboard
        int availableDays;
        //Keep prompting the user until a valid number of days is entered (1-7)
        do {
            //Display prompt - number of available days
            System.out.print("Enter the number of available days (1-7): ");
            //Read the variable from the keyboard
            availableDays = sc.nextInt();
            //Set condition to check that the value entered is between 1 and 7
            if (availableDays < 1 || availableDays > 7) {
                //Display message in case the value is incorrect
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
            }
        }
        //Loop for as long as the value is incorrect
        while (availableDays < 1 || availableDays > 7);
        /* Declare array of type String and assign to it the values retrieved by the called method
            (i.e. generate the schedule using the provided values) */
        String[] schedule = generateRehearsalSchedule(numberOfGroups, availableDays);
        //Display a header for the output
        System.out.println("\nRehearsal Schedule:");
        //Loop through each entry in the schedule and display it
        for (String entry : schedule) {
            System.out.println(entry);
        }
    }

    //Define method for generating the rehearsal schedule
    static String[] generateRehearsalSchedule(int numberOfGroups, int availableDays) {
        /* Declare array of type String and set the number of elements to the value of 'availableDays'
            (to hold one schedule entry per available day) */
        String[] schedule = new String[availableDays];
        //Loop from i = 0 to the value of 'availableDays', incrementing i by 1
        for (int i = 0; i < availableDays; i++) {
            //Set condition for the case when there are no groups
            if (numberOfGroups == 0 || i >= numberOfGroups) {
                //Mark the day as having no rehearsal
                schedule[i] = "Day " + (i + 1) + ": No rehearsal";
            } else {
                //Otherwise, the current group is assigned to the current day
                schedule[i] = "Day " + (i + 1) + ": Group " + (i + 1);
            }
        }
        //Return the completed schedule
        return schedule;
    }
}