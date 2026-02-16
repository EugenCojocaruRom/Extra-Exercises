import java.util.Scanner;

public class Main {

    //Declare and initialize static variables
    static String action = "";
    static String object = "";
    static int count = 0;

    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Declare variable of type boolean (keepCounting) and set to true
        boolean keepCounting = true;
        //Enter 'while' loop
        while (keepCounting) {
            //Display prompt
            System.out.print("Enter object (ball, coin, lens): ");
            //Declare variable of type String and read it from the keyboard
            String object = sc.nextLine();
            //Display prompt
            System.out.print("Enter action (add / remove): ");
            //Declare variable of type String and read it from the keyboard
            String action = sc.nextLine();
            //Display prompt
            System.out.print("Enter the number of items to add/remove: ");
            int count = sc.nextInt();
            sc.nextLine();

            //Call counter method
            System.out.println(countCircularObjects(action, object, count, sc));

            //Prompt to continue
            System.out.print("Continue? (yes/no): ");
            //Enter the option
            String response = sc.nextLine();
            //Exit the loop in case of 'no'
            if (response.equalsIgnoreCase("no")) {
                keepCounting = false;
            }
        }
    }

    //Declare and initialize static variables (counters) for each of the object types
    static int ballCounter = 0;
    static int coinCounter = 0;
    static int lensCounter = 0;

    //Define method for counting the objects
    public static String countCircularObjects(String action, String objectType, int count, Scanner sc) {
        //Declare variables of type in (counters) for each object type and initialize them


            //Set condition for adding / removing 'ball'
            if (objectType.equalsIgnoreCase("ball")) {
                if (action.equalsIgnoreCase("add")) {
                    //Increment counter
                    ballCounter += count;
                }
                else if (action.equalsIgnoreCase("remove")) {
                    //Return error message in case of insufficient items
                    if (ballCounter < count) {
                        return "Error: Not enough balls to remove.";
                    }
                    //Decrement counter
                    else {
                        ballCounter -= count;
                    }
                }
            }
            //Set condition for adding / removing 'coin'
            else if (objectType.equalsIgnoreCase("coin")) {
                if (action.equalsIgnoreCase("add")) {
                    //Increment counter
                    coinCounter += count;
                }
                else if (action.equalsIgnoreCase("remove")) {
                    //Return error message in case of insufficient items
                    if (coinCounter < count) {
                        return "Error: Not enough coins to remove.";
                    }
                    //Decrement counter
                    else {
                        coinCounter -= count;
                    }
                }
            }
            //Set condition for adding / removing 'lens'
            else if (objectType.equalsIgnoreCase("lens")) {
                if (action.equalsIgnoreCase("add")) {
                    //Increment counter
                    lensCounter += count;
                }
                else if (action.equalsIgnoreCase("remove")) {
                    //Return error message in case of insufficient items
                    if (lensCounter < count) {
                        return "Error: Not enough lenses to remove.";
                    }
                    //Decrement counter
                    else {
                        lensCounter -= count;
                    }
                }
            }
        //Return the number of items for each object type
        return "Current counts: balls = " + ballCounter + ", coins = " + coinCounter + ", lenses = " + lensCounter;
    }
}