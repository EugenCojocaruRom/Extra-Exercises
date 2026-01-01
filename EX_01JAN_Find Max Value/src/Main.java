import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value 'n' for number of items in the array
        System.out.print("n = ");
        //Declare variable 'n' of type int and read it from the keyboard
        int n = sc.nextInt();
        //Declare array A of type double and set the number of its elements to n
        double[] A = new double[n];

        //Method for reading and displaying the elements of array A
        displayA(A, sc);
        //Method for determining the max value in the array
        System.out.println("The maximum value in array A is: " + maxValue(A));
    }

    //Define method for reading and displaying the elements of array A
    static void displayA(double[] A, Scanner sc) {
        //Loop through array A from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; i++) {
            //Display each element of array A
            System.out.print("A[" + i + "] = ");
            //Read each element from the keyboard
            A[i] = sc.nextDouble();
        }
        //Display the array
        System.out.println("The values of array A are: " + Arrays.toString(A));
    }

    //Define method for determining the max value in the array
    static double maxValue(double[] A) {
        double max = A[0];
        //Loop through array A from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; i++) {
            //Set condition for finding the maximum value
            if (A[i] > max) {
                //The value from position i becomes the max value
                max = A[i];
            }
        }
        //Return the max value
        return max;
    }
}