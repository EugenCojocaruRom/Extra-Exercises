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
        displayNewA(A);

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
        System.out.println("The original array is: " + Arrays.toString(A));
    }

    //Define method for reading the new values of array A after changing the zeros with odd values
    static void displayNewA(int[] A) {
        //Loop through array A from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; i++) {
            //Set condition to check that an element of the array is 0
            if (A[i] == 0) {
                //Declare variable of type int for largest odd value and initialize it
                int largestOddValue = 0;
                //Loop through array A from j = i +1 to the length of A, incrementing j by 1
                for (int j = i + 1; j < A.length; j++) {
                    //Set condition to check that an element of the array is odd
                    if (A[j] % 2 != 0) {
                        //Compare A[j] to largestOddValue
                        if  (A[j] > largestOddValue) {
                            //Set the value of largestOddValue to the value of A[j]
                            largestOddValue = A[j];
                        }
                    }
                }
                //Set the value of A[i] as the current value of largestOddValue
                A[i] = largestOddValue;
            }
        }
        System.out.println("The new array is: " + Arrays.toString(A));
    }
}