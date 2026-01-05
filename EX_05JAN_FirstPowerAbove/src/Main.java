import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display label 'base' for the base number in the power operation
        System.out.print("base = ");
        //Declare variable of type int and read it from the keyboard
        int base = sc.nextInt();
        //Display label 'limit' for the value that the result of the power operation will be compared to
        System.out.print("limit = ");
        //Declare variable of type int and read it from the keyboard
        int limit = sc.nextInt();

        //Method for finding the first power that is greater than the given 'limit' value
        System.out.println("The result is: " + firstPowerAbove(base, limit));
    }

    //Define the method for finding the first power that is greater than the given 'limit' value
    static double firstPowerAbove(double base, double limit) {
        //Display the message for the intermediary powers (for debugging purposes)
        System.out.print("The intermediary powers are: \n");
        //Declare variable 'power' of type double and initialize it to 1 (i.e. base ^ 0 = 1)
        double power = 1;
        //Create a loop where the value of power (i.e. 'base' to the power 'limit') is smaller than or equal to 'limit'
        while (power <= limit) {
            //Multiply power by base at each iteration
            power *= base;
            //Display the intermediary powers
            System.out.println(power);
            //Set the condition for exceeding the value of 'limit' (compare 'power' to 'limit')
            if (power > limit) {
                //Exit the loop
                break;
            }
        }
        //Return the result
        return power;
    }
}