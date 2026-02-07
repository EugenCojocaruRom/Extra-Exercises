import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt for user
        System.out.println("Enter the username: ");
        //Declare variable of type string and read it from the keyboard
        String username = sc.nextLine();

        // user_123admin

        System.out.println("Length Check:");
        System.out.println(checkLength(username));

        System.out.println("\nPrefix Check:");
        System.out.println(checkStart(username));

        System.out.println("\nModified Username:");
        System.out.println(modifyUsername(username));
    }

        //Methods
    //1. Method for checking username length
    public static String checkLength(String username) {
        //Set condition to check if the username is null or empty
        if (username == null || username.isEmpty()) {
            //Display error message
            return "The username is incorrect.";
        }
        //Declare variable of type int for the length of the string
        int len = username.length();
        //Set condition to check if the username is null or shorter than 6 chars
        if (len < 6) {
            //Return an informative message
            return "The username is too short.";
        }
        //Declare variable of type boolean and set it to check if the length of the string is bigger or equal to 6 and return true/false
        boolean isLongEnough = len >= 6; //The boolean returns 'true' if the length is correct (>=6)
        //Return the results
        return String.format ("Username length: %d" +
                            "\nLong enough: %b",
                            len, isLongEnough);
    }

    //2. Method to check that it starts with a certain set of characters
    public static String checkStart(String username) {
        //Set condition to check if the username is null or empty
        if (username == null || username.isEmpty()) {
            //Display error message
            return "The username is incorrect.";
        }
        //Declare variable of type boolean and set it to check if the string starts with a given set of chars
        boolean startsWithUser = username.startsWith("user_");
        //Declare variable of type boolean and set it to check if the string starts with a given set of chars
        boolean startsWithAdmin = username.startsWith("admin_");
        //Return the results
        return String.format("Starts with user_: %b" +
                        "\nStarts with admin_: %b",
                        startsWithUser, startsWithAdmin);
    }

    //3. Method for modifying the username
    static String modifyUsername(String username) {
        //Set condition to check if the username is null or empty
        if (username == null || username.isEmpty()) {
            //Display error message
            return "The username is incorrect.";
        }
        //Use try-catch to handle possible errors due to incorrect string length
        try {
            //Declare variable of type String for substring and set its start and end indexes
            String partialUsername = username.substring(0, 5);
            //Return the results
            return String.format ("First 5 chars: %s" +
                            "\nUppercase: %s",
                    partialUsername, partialUsername.toUpperCase());
        }
        //Display an message in case of error
        catch (Exception e) {
            System.out.println("Incorrect username length");
        }
        //Return an empty string
        return "";
    }
}