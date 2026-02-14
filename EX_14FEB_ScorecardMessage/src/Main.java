import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt - player name
        System.out.print("Enter player name: ");
        //Declare variable of type String and read it from the keyboard
        String name = sc.nextLine();
        //Display prompt - score
        System.out.print("Enter player score: ");
        //Declare variable of type int and read it from the keyboard
        int score = sc.nextInt();

        //Call method for displaying the message
        System.out.println(generateMessage(name, score));
    }

    //Define method for handling the message
    public static String generateMessage(String playerName, int score) {
        //Handle leading/trailing whitespace in player name
        String cleanName = playerName.trim();
        //Declare variable of type String (for comment)
        String comment;
        //Determine the comment to be displayed based on score
        if (score >= 0 && score <= 50) {
            comment = "Keep practicing!";
        } else if (score >= 51 && score <= 100) {
            comment = "Nice effort!";
        } else if (score >= 101 && score <= 150) {
            comment = "Great job!";
        } else if (score >= 151 && score <= 200) {
            comment = "Wow, you're a natural!";
        } else if (score >= 201 && score <= 300) {
            comment = "Perfect game! You're a champion!";
        } else {
            comment = "Invalid score!";
        }
        //Return the complete message as a formatted string
        return String.format("Hello, %s! Your score is %d. %s", cleanName, score, comment);
    }
}