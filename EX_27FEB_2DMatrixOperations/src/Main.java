import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt
        System.out.print("Enter the number of rows: ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        sc.nextLine();
        //Display prompt
        System.out.print("Enter the number of columns: ");
        //Declare variable of type int and read it from the keyboard
        int m = sc.nextInt();
        sc.nextLine();
        //Display prompt
        System.out.println("Enter operation to perform (add/subtract): ");
        //Declare variable of type String and read the value from the keyboard
        String operation = sc.nextLine();
        //Declare 2D arrays of type int and set the number of elements for rows to n and for columns to m
        int[][] matrix1 = new int[n][m];
        int[][] matrix2 = new int[n][m];

        //Method for displaying the 2 matrices and their elements
        printMatrix(matrix1, matrix2, sc);
        //Method for displaying the resulting matrix after performing the operations
        matrixOperation(matrix1, matrix2, operation);
    }

    //Define method for reading and displaying the matrices
    static void printMatrix(int[][] matrix1, int[][] matrix2, Scanner sc) {
        //Display section title for Matrix 1
        System.out.println("\n<=== Matrix 1 ===>");
        //Loop from i = 0 to length of the array, incrementing i by 1
        for (int i = 0; i < matrix1.length; i++) {
            //Display prompt for entering the elements for each row
            System.out.println("Enter the elements for row " + (i +1) + ": ");
            //Inside this loop --> loop from j = 0 to length of each row, incrementing j by 1
            for (int j = 0; j < matrix1[i].length; j++) {
                //Display label for element
                System.out.print("Element " + (j + 1) + ": ");
                //Read the element from the keyboard
                matrix1[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }

        //Display section title for Matrix 2
        System.out.println("\n<=== Matrix 2 ===>");
        //Loop from i = 0 to length of the array, incrementing i by 1
        for (int i = 0; i < matrix2.length; i++) {
            //Display prompt for entering the elements for each row
            System.out.println("Enter the elements for row " + (i +1) + ": ");
            //Inside this loop --> loop from j = 0 to length of each row, incrementing j by 1
            for (int j = 0; j < matrix2[i].length; j++) {
                //Display label for element
                System.out.print("Element " + (j + 1) + ": ");
                //Read the element from the keyboard
                matrix2[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }

        //Display matrix 1
        System.out.println("\nMatrix 1 is: ");
        //Loop through all the rows of the matrix
        for (int[] row : matrix1) {
            //Display each row on a separate line
            System.out.println(Arrays.toString(row));
        }
        //Display matrix 2
        System.out.println("\nMatrix 2 is: ");
        //Loop through all the rows of the matrix
        for (int[] row : matrix2) {
            //Display each row on a separate line
            System.out.println(Arrays.toString(row));
        }
    }

    //Define the method for performing the add/subtract operations
    public static int[][] matrixOperation(int[][] matrix1, int[][] matrix2, String operator) {
        //Declare 2D array of type int and initialize it
        int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];
        //Set condition for 'add'
        if (operator.equals("add")) {
            //Loop from i = 0 to length of the 'resultMatrix' array, incrementing i by 1
            for (int i = 0; i < resultMatrix.length; i++) {
                //Inside this loop --> loop from j = 0 to length of each row, incrementing j by 1
                for (int j = 0; j < resultMatrix[i].length; j++) {
                    //Set the value of each element as the result of the subtraction operation
                    resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            //Display label
            System.out.println("\nMatrix after addition: ");
        }

        //Set condition for 'subtract'
        else if (operator.equals("subtract")) {
            //Loop from i = 0 to length of the 'resultMatrix' array, incrementing i by 1
            for (int i = 0; i < resultMatrix.length; i++) {
                //Inside this loop --> loop from j = 0 to length of each row, incrementing j by 1
                for (int j = 0; j < resultMatrix[i].length; j++) {
                    //Set the value of each element as the result of the subtraction operation
                    resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            //Display label
            System.out.println("\nMatrix after subtraction: ");
        }
        //Loop through all the rows of the matrix
        for (int[] row : resultMatrix) {
            //Display each row on a separate line
            System.out.println(Arrays.toString(row));
        }
        return resultMatrix;
    }
}