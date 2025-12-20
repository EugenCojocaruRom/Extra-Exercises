import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display label n for the non-negative number
        System.out.print("n = ");
        //Declare variable n of type int and read it from the keyboard
        int n = sc.nextInt();

        //Method for checking if n is a multiple of 3 or 5
        System.out.println(isMultipleOf3Or5(n));
    }

    //Define method for checking if n is a multiple of 3 or 5
    static boolean isMultipleOf3Or5(int n) {
        if ((n % 3 == 0) && (n % 5 != 0)) {
            return true;
        }
        else if ((n % 3 != 0) && (n % 5 == 0)) {
            return true;
        }
        return false;
    }
}