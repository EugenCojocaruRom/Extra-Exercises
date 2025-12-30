import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Display message for starting the party
        System.out.println("\nIt's Saturday! It's party time!!!\n");
        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display label for entering the hour
        System.out.print("Enter the hour: ");
        //Declare variable of type double for hour
        double hour = sc.nextDouble();
        //Added sc.nextLine() to consume the leftover character from the buffer
        sc.nextLine();
        //Declare variable 'energy' of type String and set its values to 'yes' and 'no'
        String[] energy = {"yes", "no"};
        //Create a 'do-while' loop to perform the actions as long as the value for hour is correct
        do {
            //Set condition to check if the hour value greater than 6
            if (hour > 6.0) {
                //Display the message for hour value greater than 6
                System.out.print("It's too late to party, find something else to do!");
                //Stop and exit the loop
                break;
            }
            //Display the message prompting the user to enter 'yes'/'no'
            System.out.println("Party on? (yes/no)");
            //Declare variable 'hasEnergy' of type String and read it from the keyboard
            String hasEnergy = sc.nextLine();
            //Set the condition for the case when the user enters 'yes', disregarding uppercase/lowercase
            if (hasEnergy.equalsIgnoreCase(energy[0])) {
                //Display the message prompting the user to enter the hour again
                System.out.print("Enter the hour: ");
                //Read the hour from the keyboard
                hour = sc.nextDouble();
                //Added sc.nextLine() to consume the leftover character from the buffer
                sc.nextLine();
                //Set condition to check if the hour value is greater than 6
                if (hour > 6.0) {
                    //Display the message for hour value greater than 6
                    System.out.print("It's too late to party, find something else to do!");
                    //Stop and exit the loop
                    break;
                }
            }
            //Set the condition for the case when the user enters 'no', disregarding uppercase/lowercase
            else if (hasEnergy.equalsIgnoreCase(energy[1])) {
                //Display the message for the user
                System.out.println("Go home!");
                //Stop and exit the loop
                break;
            }
        }
        //Set the condition for performing the loop
        while (hour <= 6.0);
    }
}