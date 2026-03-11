import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt for rows
        System.out.print("Enter the number of elements for rows: ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        //Display prompt for columns
        System.out.print("Enter the number of elements for columns: ");
        //Declare variable of type int and read it from the keyboard
        int m = sc.nextInt();
        //Declare 2D array of type int and set the number of elements for rows and columns to n and m
        int[][] matrix = new int[n][m];

        //Call the method for reading and displaying the 2D array
        displayArray(matrix, sc);
        System.out.println("The matrix is: " + Arrays.deepToString(matrix));
        //Call the method for displaying the array operations
        arrayOperations(matrix);
    }

    //Define method for reading and displaying the 2D array
    static void displayArray(int[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            //Display label for each row
            System.out.println("Row " + (i + 1) + ":");
            for (int j = 0; j < matrix[i].length; j++) {
                //Display label for each element
                System.out.print("Element " + (j + 1) + ": ");
                //Read each element from the keyboard
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    //Define method for performing array operations
    static void arrayOperations(int[][] matrix) {
        //Set condition for the case when the matrix is null of the rows/columns are empty
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        //Declare variable of type int and initialize it --> sum of matrix elements
        int sum = 0;
        //Declare variable of type int and initialize it --> maximum value in the matrix
        int max = matrix[0][0];
        //Declare array of type int and set the number of its elements to the value of the matrix length --> for storing the sums of elements of each row
        int[] rowSums = new int[matrix.length];
        //Loop from i = 0 to length of matrix, incrementing i by 1 --> rows
        for (int i = 0; i < matrix.length; i++) {
            //Declare variable of type int and initialize it --> sum of elements on each row
            int rowSum = 0;
            //Loop from j = 0 to length of matrix, incrementing j by 1 --> columns
            for (int j = 0; j < matrix[i].length; j++) {
                //Add each element of the matrix to the sum, at each iteration
                sum += matrix[i][j];
                //Add each element of the matrix to the row sum, at each iteration
                rowSum += matrix[i][j];
//                if (max < matrix[i][j]) {
//                    max = matrix[i][j];
//                }
                //Find the maximum value in the matrix
                max = Math.max(max, matrix[i][j]);
            }
            //Store the completed row sum into the 1D array
            rowSums[i] = rowSum;
        }
        //Display the results --> total sum, maximum element, sum per row
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
        System.out.println("Row Sums: " + Arrays.toString(rowSums));
    }
}