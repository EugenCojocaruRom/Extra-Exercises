import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value n
        System.out.print("n = ");
        //Declare variable m of type int and read it from the keyboard --> number of elements in array A
        int n = sc.nextInt();
        //Declare array A of type int and set the number of its elements to n
        int[] A = new int[n];

        //Call the method for the initial array
        initialArray(A, sc);
        //Call the method for the modified array
        modifiedArray(A, sc);

    }

    //Define method for reading and displaying the initial array
    static void initialArray(int[] A, Scanner sc) {
        //Loop through array A from i = 0 to length of A, incrementing i by 1
        for (int i = 0; i < A.length; ++i) {
            //Display the values of array A
            System.out.print("A[" + i + "] = ");
            //Read the values of array a from the keyboard
            A[i] = sc.nextInt();
        }
        //Display the values of array A
        System.out.print("\nThe values of list A are: " + Arrays.toString(A) + "\n");
    }

    //Define method for removing the n-th element (m) from array A
    static void modifiedArray(int[] A, Scanner sc) {
        //Display value m
        System.out.print("\nRemove number from index ");
        //Declare variable m of type int and read it from the keyboard --> the index of the number to be removed from array A
        int m = sc.nextInt();
        //Display the first part of the message for the new values of array A
        System.out.print("The new values of list A are: ");
        //Loop through array A from i = 0 to length of A, incrementing i by 1
        for (int i = 0; i < A.length; ++i) {
            //Set the condition for identifying the index of the number to be removed
            if (i == m) {
                //Skip the number at index i
                continue;
            }
            //Display the updated list of numbers after removing 'm'
            System.out.print(A[i] + ", ");
        }
    }
}