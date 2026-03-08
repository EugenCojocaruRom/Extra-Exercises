import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display section title
        System.out.println("<=== 3D Game Board Generator ===>");
        //Display prompt
        System.out.print("Enter number of levels (depth): ");
        //Declare variable of type int and read it from the keyboard
        int levels = sc.nextInt();
        //Display prompt
        System.out.print("Enter number of rows: ");
        //Declare variable of type int and read it from the keyboard
        int rows = sc.nextInt();
        //Display prompt
        System.out.print("Enter number of columns: ");
        //Declare variable of type int and read it from the keyboard
        int cols = sc.nextInt();

        //Declare variable of type String and assign to it the value retrieved by the method
        String gameBoard = create3DGameBoard(levels, rows, cols);
        //Display section title
        System.out.println("\n<=== Generated Board ===>");
        //Display the resulting game board
        System.out.println(gameBoard);
    }

    //Define method for creating the 3D game board
    public static String create3DGameBoard(int levels, int rows, int cols) {
        //Check for valid dimensions
        if (levels <= 0 || rows <= 0 || cols <= 0) {
            //Return empty string in case the values are below 0
            return "";
        }
        //Declare 3D array of type int and assign to it the values of levels, rows and columns
        int[][][] board = new int[levels][rows][cols];
        //Fill the array with the calculated values
        //Loop from i = 0 to value of levels, incrementing i by 1
        for (int i = 0; i < levels; i++) {
            //Loop from j = 0 to value of rows, incrementing j by 1
            for (int j = 0; j < rows; j++) {
                //Loop from k = 0 to value of columns, incrementing k by 1
                for (int k = 0; k < cols; k++) {
                    // Calculate base value: (level + row + col + 3) --> equivalent to (i+1) + (j+1) + (k+1)
                    int baseValue = i + j + k + 3;
                    // Check if the cell is on any edge (first or last index of any dimension)
                    boolean isEdge = (i == 0 || i == levels - 1) ||
                            (j == 0 || j == rows - 1) ||
                            (k == 0 || k == cols - 1);
                    //Apply edge multiplier rule
                    if (isEdge) {
                        board[i][j][k] = baseValue * 10;
                    } else {
                        board[i][j][k] = baseValue;
                    }
                }
            }
        }
        //Create the output string
        String result = "";
        for (int i = 0; i < levels; i++) {
            result += "Level " + i + ": \n";
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    result += board[i][j][k];
                    if (k < cols - 1) result += " ";
                }
                result += "\n";
            }
            if (i < levels - 1) result += "\n";
        }
        //Return the resulting string
        return result;
    }
}