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
        //Method for calculating the sum of the elements of array A
        System.out.println("The sum of the elements of array A is: " + sum(A));
        //Method for calculating the average of the elements of array A
        System.out.println("The average of the elements of array A is: " + average(A));
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

    //Define method for calculating the sum of the elements of array A
    static double sum(double[] A) {
        //Declare variable 'sum' of type double and initialize it
        double sum = 0;
        //Loop through the array from i = 0 to the length of A, incrementing i by 1
        for (int  i = 0; i < A.length; i++) {
            //Calculate the sum by adding the value of i at each iteration
            sum += A[i];
        }
        //Alternative --> using enhanced for
//        for (double v : A) {
//            sum += v;
//        }
        //Return the value of the sum
        return sum;
    }

    //Define method for calculating the average of the elements of array A
    static double average(double[] A) {
        //Declare variable 'nums' of type int for the length of array A
        int nums = A.length;
        //Calculate and return the average by dividing the sum (retrieved by calling the method) to the number of elements in the array
        return sum(A) / nums;
    }
}