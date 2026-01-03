import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value 'n' for the number of elements in the array
        System.out.print("n = ");
        //Declare variable 'n' of type int and read it from the keyboard
        int n = sc.nextInt();
        //Declare array A of type double and set the number of its elements to n
        double[] A = new double[n];

        //Method for reading and displaying array A
        displayA(A, sc);
        //Method for displaying the sum
        System.out.println("The sum is: " + sumPositives(A));
    }

    //Define method for reading and displaying array A
    static void displayA(double[] A, Scanner sc) {
        //Loop through array A from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; i++) {
            //Display the label for each element of array A
            System.out.print("A[" + i + "] = ");
            //Read each element of array A from the keyboard
            A[i] = sc.nextDouble();
        }
        //Display the elements of the original array
        System.out.println("The elements of array A are: " + Arrays.toString(A));
    }

    //Define method for displaying the sum of the positive elements from array A
    static double sumPositives(double[] A) {
        //Declare variable 'sum' of type double and initialize it
        double sum = 0;
        //Loop through the array from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; i++) {
            //Set the condition for checking if the element is positive
            if (A[i] < 0) {
                //Stop the loop when a negative value is fount
                break;
            }
            //Add the element (if positive) to the sum at each iteration
            sum += A[i];
        }
        //Return the sum
        return sum;
    }
}