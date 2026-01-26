import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt for the user
        System.out.print("Enter the number of iterations: ");
        //Declare variable of type int and read it from the keyboard -> number of iterations
        int iterations = sc.nextInt();
        //Display prompt for the user
        System.out.print("Enter the 1st number: ");
        //Declare variable of type double and read it from the keyboard ->
        double num1 = sc.nextDouble();
        //Display prompt for the user
        System.out.print("Enter the 2nd number: ");
        //Declare variable of type double and read it from the keyboard ->
        double num2 = sc.nextDouble();

        //Loop from i = 0 to the value of iterations, incrementing i by 1
        for (int i = 0; i < iterations; i++) {
            //Exit the loop when either num1 or num2 becomes smaller than 2
            if (num1 < 2 || num2 < 2) {
                break;
            }
            //Declare variable 'big' to store the result of the 'bigger' method
            double big = bigger(num1, num2);
            //Set the condition for the case when num1 is the bigger number
            if (big == num1) {
                //Divide num1 by 2
                num1 = num1 / 2;
                //Display the result of the division
                System.out.println(" > Divided by 2: " + num1);
            }
            //Set the condition for the case when num2 is the bigger number
            else {
                //Divide num2 by 2
                num2 = num2 / 2;
                //Display the result of the division
                System.out.println(" > Divided by 2: " + num2);
            }
        }
    }

    //Method for finding the bigger number between num1 and num2
    static double bigger(double num1, double num2) {
        //Set condition for num1 greater than or equal to num2
        if (num1 >= num2) {
            //Display message for the user
            System.out.println("The bigger number is " + num1);
            //Return the value of num1
            return num1;
        }
        //Set condition for num2 greater than num1
        else {
            //Display message for the user
            System.out.println("The bigger number is " + num2);
            //Return the value of num2
            return num2;
        }
    }
}