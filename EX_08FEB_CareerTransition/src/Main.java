import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt for the user
        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();

        //Method for calculating the number of lines of code written and the number of concepts learned
        System.out.println(careerTransition(n));
    }

    //Define method for calculating the number of lines of code written and the number of concepts learned
    static String careerTransition(int days) {
        //Declare variables of type int and initialize them
        int linesOfCode = 0;
        int concepts = 0;
        //Loop through the number of days starting from i = 1 to the max value of days, incrementing i by 1
        for (int i = 1; i <= days; i++) {
            //Check if it's a non-learning day
            if (i % 7 == 0) {
                //The day is skipped
                continue;
            }
            //Increment linesOfCode by 10 at each iteration
            linesOfCode += 10;
            //Check if the number of days is divisible by 3
            if (i % 3 == 0) {
                //Increment concepts by 1
                concepts++;
            }
            //Check if the number of concepts is 5 to stop learning
            if (concepts == 5) {
                //Exit the loop
                break;
            }
        }
        //Return the results (lines of code and concepts)
        return String.format("In %d days, the man wrote %d lines of code and learned %d programming concepts.",
                            days, linesOfCode, concepts);
    }
}