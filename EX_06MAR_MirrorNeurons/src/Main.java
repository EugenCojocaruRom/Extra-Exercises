import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt for entering the number of rows
        System.out.print("Enter number of rows: ");
        //Declare variable of type int and read it from the keyboard
        int rows = sc.nextInt();
        //Display prompt for entering the number of columns
        System.out.print("Enter number of columns: ");
        //Declare variable of type int and read it from the keyboard
        int cols = sc.nextInt();

        //Declare 2D array of type if for reading the grid input
        int[][] grid = readGrid(sc, rows, cols);
        //Declare array of type String for reading the actions input
        String[] actions = readActions(sc);

        //Call the mirrorNeurons function with the provided inputs
        int[][] result = mirrorNeurons(grid, actions);

        //Display the resulting grid
        System.out.println("\nFinal neuron activity grid: ");
        //Loop from row = 0 to length of result array, incrementing row by 1
        for (int row = 0; row < result.length; row++) {
            //Inside this loop -> loop from col = 0 to the length of each row of the result array, incrementing col by 1
            for (int col = 0; col < result[row].length; col++) {
                //Print each cell, separating the values with a space
                System.out.print(result[row][col] + " ");
            }
            //Move to the next line after each row
            System.out.println();
        }
    }

    //Method for reading the grid values entered by the user and returning the filled 2D array
    static int[][] readGrid(Scanner sc, int rows, int cols) {
        //Declare 2D array of type int and assign to it the values entered by the user for rows and columns
        int[][] grid = new int[rows][cols];
        //Display prompt
        System.out.println("Enter each neuron activity level (1-100): ");
        //Loop from row = 0 to the value of rows, incrementing row by 1
        for (int row = 0; row < rows; row++) {
            //Inside this loop -> loop from col = 0 to the value of columns, incrementing col by 1
            for (int col = 0; col < cols; col++) {
                //Display each grid cell value
                System.out.print("\tgrid[" + row + "][" + col + "] = ");
                //Read each cell value from the keyboard
                grid[row][col] = sc.nextInt();
            }
        }
        //Return the populated grid array
        return grid;
    }

    //Method for reading the actions entered by the user and returning the filled actions array
    static String[] readActions(Scanner sc) {
        //Display prompt
        System.out.print("Enter number of actions: ");
        //Declare variable of type int and read it from the keyboard
        int numActions = sc.nextInt();
        //Consume leftover newline after nextInt()
        sc.nextLine();
        //Declare array of type String and set the number of its elements to the number of actions
        String[] actions = new String[numActions];
        //Display prompt
        System.out.println("Enter each action (lowercase letters only): ");
        //Loop from i = 0 to the value of numActions, incrementing i by 1
        for (int i = 0; i < numActions; i++) {
            //Display each action
            System.out.print("\tAction " + (i + 1) + ": ");
            //Read each action value from the keyboard
            actions[i] = sc.nextLine();
        }
        //Return the populated array
        return actions;
    }

    //Method for the function that simulates mirror neuron activity based on actions
    public static int[][] mirrorNeurons(int[][] grid, String[] actions) {
        //Iterate over each observed action in the actions array
        for (String action : actions) {
                // --> Reverse the rows of the grid to simulate the mirroring effect
            //Declare variable of type int and initialize it to zero - starting from the first row
            int top = 0;
            //Declare variable of type int and initialize it to zero - starting from the last row
            int bottom = grid.length - 1;
            //Swap rows from outside in until the two pointers meet in the middle
            while (top < bottom) {
                //Declare array of type int to temporarily store the top row
                int[] temp = grid[top];
                //Replace top row with bottom row
                grid[top] = grid[bottom];
                //Replace bottom row with saved top row
                grid[bottom] = temp;
                //Move top pointer down
                top++;
                // Move bottom pointer up
                bottom--;
            }

                // --> Increase every neuron's activity level by 1
            //Loop through each row from row = 0 to the length of the grid, incrementing row by 1
            for (int row = 0; row < grid.length; row++) {
                //Inside this loop -> loop through each column from col = 0 to the length of the row, incrementing col by 1
                for (int col = 0; col < grid[row].length; col++) {
                    //Increment the grid cell value (e.g. neuron's activity level) by 1
                    grid[row][col]++;
                }
            }
        }
        // Return the final grid after all actions have been processed
        return grid;
    }
}