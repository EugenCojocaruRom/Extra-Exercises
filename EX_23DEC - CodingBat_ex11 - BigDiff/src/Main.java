import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value nums for the number of elements in the array
        System.out.print("nums = ");
        //Declare variable 'nums' of type int and read it from the keyboard
        int nums = sc.nextInt();
        //Declare array A of type int and set the number of its elements to the value of nums
        int[] A = new int[nums];

        //Method for reading array A
        readArrayA(A, sc);
        //Method for calculating the difference between max and min
        findMinMax(A);
    }

    //Define the method for reading array A
    static void readArrayA(int[] A, Scanner sc) {
        //Loop through array A from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; i++) {
            //Display each element of array A
            System.out.print("A[" + i + "] = ");
            //Read the value of each element from the keyboard
            A[i] = sc.nextInt();
        }
        //Display array A
        System.out.println("Array A is: " + Arrays.toString(A));
    }

    //Define method for finding the min and the max values
    static void findMinMax(int[] A) {
        //Declare variable 'min' of type int and set its initial value as the first element of array A
        int min = A[0];
        //Declare variable 'max' of type int and set its initial value as the first element of array A
        int max = A[0];
        //Loop through array A from i = 0 to the length of A, incrementing i by 1
        for  (int i = 0; i < A.length; i++) {
            //Set the rule for comparing the value of 'min' to each element of array A
            if (min > A[i]) {
                //Set the value of 'min' as the value of the element, in case it is bigger (as set above)
                min = A[i];
            }
            //Set the rule for comparing the value of 'max' to each element of array A
            if (max < A[i]) {
                //Set the value of 'max' as the value of the element, in case it is smaller (as set above)
                max = A[i];
            }
        }
        //Display the min value
        System.out.println("min = " + min);
        //Display the max value
        System.out.println("max = " + max);
        //Display the difference between max and min
        System.out.println("The difference between min and max is " + (max - min));
    }
}