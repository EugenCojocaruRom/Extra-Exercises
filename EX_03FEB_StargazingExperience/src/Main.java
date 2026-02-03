import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display title
        System.out.println(" === Stargazing Experience === ");
        //Display prompt for user
        System.out.print("Enter the number of minutes: ");
        //Declare variable of type int and read it from the keyboard
        int minutes = sc.nextInt();
        //Display prompt for user
        System.out.print("Enter the number of initial stars: ");
        //Declare variable of type int and initialize it
        int initialStars = sc.nextInt();
        sc.nextLine();
        //Display separator
        System.out.println(" ============================= ");

        //Method for displaying the number of stars seen
        System.out.println(countStars(initialStars, minutes));
    }

    //Define method for counting stars
    static String countStars(int initialStars, int minutes) {
        //Declare variable of type int for storing the number of final stars seen and initialize it as the number of initial stars
        int finalStars = initialStars;
        //Loop from i = 0 to the number of minutes, incrementing i by 1
        for (int i = 0; i < minutes; i++) {
            //Increment the number of final stars at each iteration
            finalStars++;
        }
        //Declare variable of type String and set it to repeat the * symbol for as many times as indicated by the number of final stars
        String asciiStarArt = "*".repeat(finalStars);
        //Return the string with the required details
        return String.format(
                "\tStargazing Session Summary:\n" +
                        "\t---------------------------\n" +
                        "\tInitial stars: %d\n" +
                        "\tMinutes spent: %d\n" +
                        "\tFinal stars seen: %d\n" +
                        "\tNight sky view: %s",
                initialStars, minutes, finalStars, asciiStarArt);
    }
}