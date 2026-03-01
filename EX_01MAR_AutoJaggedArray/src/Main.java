import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display section title for the jagged array
        System.out.println("<=== Jagged array elements ===>");
        //Display prompt
        System.out.print("Enter the number of rows: ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        sc.nextLine();
        //Declare 2D array of type int and initialize it with the product of row and column indices
        int[][] jaggedArray = createJaggedArray(n, sc);

        //Method for displaying the jagged array
        System.out.println("The jagged array is: " + Arrays.deepToString(jaggedArray));
    }


    //Define method for creating the jagged array
    public static int[][] createJaggedArray(int n, Scanner sc) {
        //Declare 2D array of type int and set the number of rows to n
        int[][] jaggedArray = new int[n][];
        //Loop from i = 0 to n, incrementing i by 1
        for (int i = 0; i < n; i++) {
            //Prompt to enter the number of element on each row
            System.out.print("Enter the number of elements for row " + (i + 1) + ": ");
            //Declare variable of type int and read it from the keyboard
            int size = sc.nextInt();
            //Allocate the row with that size
            jaggedArray[i] = new int[size];
            //Inside this loop --> loop from j = 0 to length of each row, incrementing j by 1
            for (int j = 0; j < jaggedArray[i].length; j++) {
                //Set the value of each element of the jagged array to the product of i + 1 and j + 1
                jaggedArray[i][j] = (i + 1) * (j + 1);
            }
        }
        //Return the resulting jagged array
        return jaggedArray;
    }
}