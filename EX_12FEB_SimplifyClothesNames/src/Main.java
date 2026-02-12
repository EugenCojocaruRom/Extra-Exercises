import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt
        System.out.print("Enter clothing piece name: ");
        //Declare variable of type string and read it from the keyboard
        String name = sc.nextLine();
        //Display prompt
        System.out.print("Enter clothing piece length: ");
        //Declare variable of type int and read it from the keyboard
        int length = sc.nextInt();
        sc.nextLine();
        
        //Call method for simplifying the name
        System.out.println("Simplified name: " + simplifyClothingName(name, length));
    }

    static String simplifyClothingName(String fullName, int length) {
        //Declare variable of type String and set it to empty
        String prefix;
        //Determine the prefix based on the name length
        if (length < 30) {
            prefix = "Mini-";
        } else if (length >= 30 && length <= 50) {
            prefix = "Midi-";
        } else {
            prefix = "Long-";
        }
        //Remove all spaces from the full name
        String noSpaces = fullName.replace(" ", "");
        //Keep only the first 10 characters (while checking the length to avoid errors)
        String truncatedName;
        if (noSpaces.length() > 10) {
            truncatedName = noSpaces.substring(0, 10);
        } else {
            truncatedName = noSpaces;
        }
        //Combine prefix and truncated name and convert to lowercase
        String result = prefix + truncatedName;
        return result.toLowerCase();
    }
}