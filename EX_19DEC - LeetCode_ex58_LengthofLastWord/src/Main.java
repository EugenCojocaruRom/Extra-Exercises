import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display message for user
        System.out.println("Enter words here: ");
        //Declare variable of type string and read it from the keyboard
        String words = sc.nextLine();

        //Display the length of the last word as retrieved by the method
        System.out.println("\nThe length of the last word is " + lastWordLength(words));
    }

    //Define method for determining the length of the last word
    static int lastWordLength(String words) {
        //Trim any leading and trailing whitespace from the string
        words = words.trim();
        //Search the string from right to left and return the index of the last occurrence of a space character
        int lastSpace = words.lastIndexOf(' ');
        //Subtract lastspace from the length of the string to get the distance from the last space to the end
        //Subtract extra 1 so that the space itself is not counted
        return words.length() - lastSpace - 1;
    }
}