import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt
        System.out.print("Enter the main string: ");
        //Declare variable of type String and read it from the keyboard
        String mainString = sc.nextLine();
        //Display prompt
        System.out.print("Enter the pattern to search: ");
        //Declare variable of type String and read it from the keyboard
        String patternString = sc.nextLine();
        //Declare and create array of type String for main and split it by commas
        String[] str1 = mainString.split(",");
        //Declare and create array of type String for pattern and split it by commas
        String[] str2 = patternString.split(",");

        //Display the result label and call the method
        System.out.println("Pattern found: " + containsPattern(str1, str2));
    }

    //Define method for finding the pattern inside thye main string
    public static boolean containsPattern(String[] mainArray, String[] pattern) {
        //Set condition for 0 length main string
        if (pattern.length == 0) {
            return true; //Empty pattern is always found
        }
        //Set condition for pattern longer than main string
        if (pattern.length > mainArray.length) {
            return false; //Pattern can't be larger than main array
        }

        //Check each possible starting position in mainArray
        for (int i = 0; i <= mainArray.length - pattern.length; i++) {
            //Declare variable of type boolean and set it to true
            boolean found = true;

            //Check if pattern matches starting at position i
            for (int j = 0; j < pattern.length; j++) {
                //Set condition in case the pattern does not match the sequence in main
                if (!mainArray[i + j].equals(pattern[j])) {
                    //Return 'found' as false
                    found = false;
                    //Exit loop
                    break;
                }
            }
            //Return true if the pattern matches
            if (found) {
                return true;
            }
        }
        //Return false if none of the conditions are satisfied
        return false;
    }
}