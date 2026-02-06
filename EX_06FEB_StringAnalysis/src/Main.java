import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt for user
        System.out.println("Enter the string to be analyzed: ");
        //Declare variable of type string and read it from the keyboard
        String message = sc.nextLine();

        //String to use: They speak English in the United States.

        //Call the method for analyzing the string
        String analysis = analyzeString(message);
        System.out.println(analysis);
    }

    //Define the method for analyzing the string
    static String analyzeString(String str) {
        //Declare variables and set their values
        int len = str.length();
        char c = str.charAt(4);
        String sub1 = str.substring(7);
        String sub2 = str.substring(3, 6);
        boolean endsWithDot = str.endsWith(".");
        String allCaps = str.toUpperCase();

        //Return the results as a formatted string
        return String.format ("Length: %d\n" +
                        "Char at index 4: %c\n" +
                        "Substring 1: %s\n" +
                        "Substring 2: %s\n" +
                        "Ends with dot: %b\n" +
                        "Uppercase: %s",
                len, c, sub1, sub2, endsWithDot, allCaps);
    }
}