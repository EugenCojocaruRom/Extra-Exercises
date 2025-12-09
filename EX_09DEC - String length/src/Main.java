import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value str for the string
        System.out.print("str = ");
        //Declare variable str of type String and read it from the keyboard
        String str = sc.nextLine();

        //Display the message containing the length of the string, calculated using the method
        System.out.print("The string contains " + numChars(str) + " characters");
    }

    //Define the method for counting the number of characters in the given string
    static int numChars(String str) {
        //Return the value retrieved via the length() method
        return str.length();
    }
}