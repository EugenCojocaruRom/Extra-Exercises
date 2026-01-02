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
        //Method for displaying the maximum value in array A
        System.out.println("The maximum value in array A is " + maxA(A));
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

    //Define the method for finding the maximum value in array A
    static double maxA(double[] A) {
        //Define condition for empty array
        if  (A.length == 0) {
            //Return empty in case of empty array
            return Double.NEGATIVE_INFINITY;
        }
        //Declare variable 'max' of type double and set its default value as the minimum possible
        double max = Double.NEGATIVE_INFINITY;
        //Loop through the values of the array --> for-each is OK if the index does not need to be known/stored
        for (double valA : A) {
            //Set the condition for comparing each value of the array to 'max'
            if (valA > max) {
                //Set 'max' as the current value when the condition above is met
                max = valA;
            }
        }
        //Return the value of 'max'
        return max;
    }

}