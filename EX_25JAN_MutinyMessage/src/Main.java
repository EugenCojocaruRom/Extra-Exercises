import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt for the user
        System.out.println("Enter your message: ");
        //Declare variable of type string and read it from the keyboard
        String message = sc.nextLine();

        //Display the new message, reversed and with the characters replaced
        System.out.println("The encoded message is: " + encodeMessage(message));
    }

    //Define method for reversing and replacing the 'a' and 'm' characters
    static String encodeMessage(String message) {
        //Empty string to store the modified message
        String encodedMessage = "";
        //Loop through the string from i = 0 to the length of the string, incrementing i by 1
        for (int i = 0; i < message.length(); i++) {
            //Add each character to the empty string
            encodedMessage = message.charAt(i) + encodedMessage.toLowerCase();
        }
        //Replace each 'a' with '*'
        encodedMessage = encodedMessage.replace('a', '*');
        //Replace each 'm' with '#'
        encodedMessage = encodedMessage.replace('m', '#');
        //Return the modified message
        return encodedMessage;
    }
}