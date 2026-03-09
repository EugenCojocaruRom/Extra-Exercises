import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt - size of the square matrix
        System.out.print("Enter the size of the square matrix (e.g., 4 for 4x4): ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        //Declare 2D array of type int and set the values for rows and columns to n
        int[][] userMatrix = new int[n][n];
        //Display prompt for entering the individual elements of the 2D array
        System.out.println("Enter the elements of the matrix row by row: ");
        //Loop from i = 0 to n, incrementing i by 1 --> rows
        for (int i = 0; i < n; i++) {
            //Loop from j = 0 to n, incrementing j by 1 --> columns
            for (int j = 0; j < n; j++) {
                //Display label for each element
                System.out.print("Element [" + i + "][" + j + "]: ");
                //Read each value from the keyboard
                userMatrix[i][j] = sc.nextInt();
            }
        }
        //Call the method to display the patterns
        printPatterns(userMatrix);
    }

    //Define method for displaying the patterns
    public static void printPatterns(int[][] matrix) {
        //Declare variable of type int and initialize it to the value of the matrix length
        int n = matrix.length;
        //Check that the matrix is not empty
        if (n == 0) {
            return;
        }

        //Main Diagonal: row == col
        System.out.print("Main Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        //Anti-Diagonal: row + col == n - 1
        System.out.print("Anti-Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - 1 - i] + " ");
        }
        System.out.println();

        //Top Border: First row (index 0)
        System.out.print("Top Border: ");
        for (int j = 0; j < n; j++) {
            System.out.print(matrix[0][j] + " ");
        }
        System.out.println();

        //Bottom Border: Last row (index n - 1)
        System.out.print("Bottom Border: ");
        for (int j = 0; j < n; j++) {
            System.out.print(matrix[n - 1][j] + " ");
        }
        System.out.println();

        //Left Border: First column (index 0)
        System.out.print("Left Border: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][0] + " ");
        }
        System.out.println();

        //Right Border: Last column (index n - 1)
        System.out.print("Right Border: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - 1] + " ");
        }
        System.out.println();
    }
}