import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value n for number of values of array
        System.out.print("n = ");
        //Declare variable n of type int and read it from the keyboard
        int n = sc.nextInt();
        //Declare array A of type int and set the number of its values to n
        int[] A = new int[n];

        //Method for reading the values of array A and displaying it
        displayA(A, sc);
        //Method for reading the new values of array A and displaying it
        sumOf2Equals8(A);
    }

    //Define method for reading the values of array A and displaying it
    static void displayA(int[] A, Scanner sc) {
        //Loop through array A from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; i++) {
            //Display the values of array A
            System.out.print("A[" + i + "] = ");
            //Read the values of A from the keyboard
            A[i] = sc.nextInt();
        }
        System.out.println("The array is: " + Arrays.toString(A));
    }

    //Define method for checking the values of the array and summing them up
    static void sumOf2Equals8(int[] A) {
        //Declare variable 'sum' of type int and initialize it
        int sum = 0;
        //Loop through array A from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; i++) {
            //Set condition to check that an element is equal to 2
            if (A[i] == 2) {
                //Increment the 'sum' with each element of value 2 found
                sum += A[i];
            }
        }
        //Set condition to check that the sum is strictly 8
        if (sum == 8) {
            //Print 'true' if the sum of elements of value 2 is exactly 8
            System.out.println(true);
        }
        //Set condition for the case when the sum is different from 8
        else {
            //Print 'false' if the sum of elements of value 2 is other than 8
            System.out.println(false);
        }
    }
}