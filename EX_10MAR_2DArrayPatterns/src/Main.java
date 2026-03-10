import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt
        System.out.print("Enter matrix size (n): ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        //Declare 2D array of type int and set the number of rows and columns to n
        int[][] matrix = new int[n][n];

        //Display prompt to enter the values of the 2D array
        System.out.println("Enter the " + n + "x" + n + " matrix values row by row:");
        //Loop from i = 0 to n, incrementing i by 1 --> rows
        for (int i = 0; i < n; i++) {
            //Display label for each value
            System.out.print("Row " + (i + 1) + ": ");
            //Loop from j = 0 to n, incrementing j by 1 --> columns
            for (int j = 0; j < n; j++) {
                //Read each value from the keyboard
                matrix[i][j] = sc.nextInt();
            }
        }
        //Display empty row
        System.out.println();
        //Call the method for printing the patterns
        printAdvancedPatterns(matrix);
    }

    //Define the method for printing the advanced patterns
    public static void printAdvancedPatterns(int[][] matrix) {
        //Declare variable of type int and initialize it to the value of the matrix length
        int n = matrix.length;
        //Declare variable of type StringBuilder to build the output string
        StringBuilder sb = new StringBuilder();

            //Both diagonals together
        //Main diagonal: [0][0], [1][1], ..., [n-1][n-1] --> (top-left to bottom-right)
        //Loop from i = 0 to n, incrementing i by 1 at each iteration
        for (int i = 0; i < n; i++) {
            /* Append the element where the row and column are both i (the main diagonal cell),
            followed by a space to separate values in the output*/
            sb.append(matrix[i][i]).append(" ");
        }
        //Anti-diagonal: [0][n-1], [1][n-2], ..., [n-1][0] --> (top-right to bottom-left)
        //Skip center if it is odd (as it was already added by the main diagonal)
        for (int i = 0; i < n; i++) {
            //Set condition to check if n is odd and if we are in the middle of the row
            if (n % 2 != 0 && i == n / 2) {
                continue; //In case of identical values for the center, it is skipped
            }
            //Append the anti-diagonal cell: row i, column (n-1-i) mirrors i on the other side of the center
            sb.append(matrix[i][n - 1 - i]).append(" ");
        }
        //Display the combined diagonals result, trimming the trailing space
        System.out.println("Both Diagonals: " + sb.toString().trim());

            //Spiral order traversal
        //Reset the StringBuilder to 0 so it can be reused for building the spiral output
        sb.setLength(0);
        //Declare variables of type int for top, bottom, left and right values
        int top = 0; //index of the topmost row not yet checked
        int bottom = n - 1; //index of the bottommost row not yet checked
        int left = 0; //index of the leftmost column not yet checked
        int right = n - 1; //index of the rightmost column not yet checked
        //Loop for as long as there are still rows and columns left to check
        while (top <= bottom && left <= right) {
            //Check the top row from left to right
            for (int col = left; col <= right; col++)
                //Append the checked cells, separated by space
                sb.append(matrix[top][col]).append(" ");
            //Increment the index of top --> it is now checked
            top++;

            //Check the right column from top to bottom
            for (int row = top; row <= bottom; row++)
                //Append the checked cells, separated by space
                sb.append(matrix[row][right]).append(" ");
            //Decrement the index of right --> it is now checked
            right--;

            //Set condition for the case when a bottom row still exists
            if (top <= bottom) {
                //Check the bottom row from right to left
                for (int col = right; col >= left; col--)
                    //Append the checked cells, separated by space
                    sb.append(matrix[bottom][col]).append(" ");
                //Decrement the index of bottom --> it is now checked
                bottom--;
            }

            //Set condition for the case when a left column still exists
            if (left <= right) {
                //Check the left column from bottom to top
                for (int row = bottom; row >= top; row--)
                    //Append the checked cells, separated by space
                    sb.append(matrix[row][left]).append(" ");
                //Increment the index of left --> it is now checked
                left++;
            }
        }
        //Display the full spiral order result, trimming the trailing space
        System.out.println("Spiral Order: " + sb.toString().trim());
    }
}