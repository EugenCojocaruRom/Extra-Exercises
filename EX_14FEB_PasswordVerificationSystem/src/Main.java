import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt - enter password (the one that will be stored)
        System.out.print("Enter base password: "); //use SecurePass123
        //Declare variable of type String and read it from the keyboard
        String storedPassword = sc.nextLine();
        //Display prompt - enter password (user attempt)
        System.out.print("Enter password to check: "); //use securepass123 / SecurePass123 / SecurePass12 / password123 / 12345678 / qwerty123
        //Declare variable of type String and read it from the keyboard
        String userAttempt = sc.nextLine();

        //Declare variables of type String and call the comparison methods
        String exactCheck = checkExactMatch(storedPassword, userAttempt);
        String caseCheck = checkIgnoreCase(storedPassword, userAttempt);
        String comparison = comparePasswords(storedPassword, userAttempt);

        //Display section title and separator
        System.out.println("Password Validation Results:");
        System.out.println("---------------------------");
        //Display comparison results
        System.out.println(exactCheck);
        System.out.println(caseCheck);
        System.out.println(comparison);
    }

    //Define method for checking if tye stored password matches exactly the password entered by the user
    public static String checkExactMatch(String stored, String attempt) {
        //Declare variable of type boolean and set its value based on the comparison between the stored password and the attempted one
        boolean passwordsMatch = stored.equals(attempt);
        //Return the message and the comparison result (true / false)
        return "Password match (exact): " + passwordsMatch;
    }

    //Define method for checking if passwords match when ignoring case
    public static String checkIgnoreCase(String stored, String attempt) {
        //Declare variable of type boolean and set its value based on the comparison between the stored password and the attempted one, while ignoring case
        boolean passwordsMatch = stored.equalsIgnoreCase(attempt);
        //Return the message and the comparison result (true / false)
        return "Password match (ignore case): " + passwordsMatch;
    }

    //Define method for comparing passwords alphabetically
    public static String comparePasswords(String stored, String attempt) {
        //Declare variable of type int and set its value based on the comparison between the attempted password and the stored one
        int comparison = attempt.compareTo(stored);
        //Declare variable of type String (for result)
        String result;
        //Set the conditions for the result of the comparison
        if (comparison < 0) {
            result = "Before";
        } else if (comparison > 0) {
            result = "After";
        } else {
            result = "Exact match";
        }
        //Return the message and the comparison result (Before / After / Exact match)
        return "Password comparison: " + result;
    }
}