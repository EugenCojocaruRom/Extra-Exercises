import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display label x for the first number
        System.out.print("x = ");
        //Declare variable n of type int and read it from the keyboard
        int x = sc.nextInt();
        //Display label y for the first number
        System.out.print("y = ");
        //Declare variable n of type int and read it from the keyboard
        int y = sc.nextInt();

        //Method for calculating the sum of x and y
        System.out.println("The sum of x and y is: " + checkSumForTeenValue(x, y));
    }

    //Define method for calculating the sum of x and y, and checking for 'teen' value
    static int checkSumForTeenValue (int x, int y) {
        //Declare variable 'sum' of type int and set it to calculate the sum of x and y
        int sum = x + y;
        //Set condition for calculating the sum of x and y, while checking for 'teen' value
        if ((x >= 13) && (x <= 19) || (y >= 13) && (y <= 19)) {
            return 19;
        }
        else {
            return sum;
        }
    }
}