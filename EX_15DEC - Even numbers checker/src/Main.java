import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value n for number of values
        System.out.print("n = ");
        //Declare variable n of type int and read it from the keyboard
        int n = sc.nextInt();
        //Declare array A of type int and set the number of its elements to n
        int[] A = new int[n];
        //Loop through array a from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; i++) {
            //Display the value of each element
            System.out.print("A[" + i + "] = ");
            //Read the value from the keyboard
            A[i] = sc.nextInt();
        }
        //Display array A on the screen
        System.out.print("\nThe elements of array A are: " + Arrays.toString(A) + "\n");
        //Loop through array a from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; ++i) {
            //Set condition for checking that a number is even
            if (A[i] % 2 == 0) {
                System.out.println(A[i] + " is even");
            }
        }
    }
}