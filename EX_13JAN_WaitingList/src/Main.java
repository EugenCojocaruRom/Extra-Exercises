import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declare list of type string to store the names of people on the waiting list
        List<String> waitList = new ArrayList<>();
        //Call method for displaying the app menu
        waitListMenuActions();
        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Perform various actions
        while (true) {
            //Read the number received from console up to Enter
            System.out.print("Enter an option: ");
            //Declare variable 'name' of type string
            String name;
            //Declare variable 'option' of type int and read it from the keyboard
            int option = sc.nextInt();
            //Mandatory: also read the 'enter' received after entering the option, to get rid of the newline character left in the buffer
            sc.nextLine();
            //Loop through the options
            switch (option) {
                //Add guest
                case 1:
                    System.out.println("- You selected 'Add guest'. Enter the name of the guest:");
                    name = sc.nextLine();
                    arrive(waitList, name);
                    break;
                //Remove guest
                case 2:
                    System.out.println("- You selected 'Remove guest'. Enter the name of the guest:'.");
                    name = sc.nextLine();
                    cancel(waitList, name);
                    break;
                //invite next guest on the list to the table
                case 3:
                    System.out.println("- You selected 'Invite guest to table'. Enter the name of the guest:");
                    seatNext(waitList);
                    break;
                //Display the number of guest left on the waiting list
                case 4:
                    System.out.println("- You selected 'Display info.'");
                    info(waitList);
                    break;
                //Close the application
                case 5:
                    System.out.println("Closing application. Bye!");
                    break;
                //Display default message in case of invalid value
                default:
                        System.out.println("Invalid option. Try again.");
            }
        }
    }

    //Method for waitlist menu actions
    public static void waitListMenuActions() {
        System.out.println("=========== Restaurant Waiting List ===========");
        System.out.println("| 1. Add guest                2. Remove guest |");
        System.out.println("| 3. Invite guest to table    4. Display info |");
        System.out.println("| 5. Close application                        |");
        System.out.println("===============================================");
    }

    //Method for adding guest
    public static void arrive(List<String> waitList, String name) {
        waitList.add(name);
        System.out.println("- " + name + " was added to the waiting list.");
    }

    //Method for removing guest
    public static void cancel(List<String> waitList, String name) {
        if (waitList.contains(name)) {
            waitList.remove(name);
            System.out.println("- " + name + " canceled the reservation.");
        }
    }

    //Method for seating the next guest
    public static void seatNext(List<String> waitList) {
        if (waitList.isEmpty()) {
            System.out.println("The waiting list is empty. There is no one to ask to take a seat.");
        }
        else {
            System.out.println(waitList.get(0) + " was invited to take a seat at the table.");
            waitList.remove(0);
        }
    }

    //Method for displaying the remaining guests to be seated
    public static void info(List<String> waitList) {
        int count = waitList.size();
        System.out.println("There are " + count + " guests remaining on the waiting list.");
        System.out.println(waitList);
    }
}