import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt
        System.out.print("Enter the number of rows (crates of fish): ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        sc.nextLine();
        //Display prompt
        System.out.print("Enter the number of columns (number of fish per crate): ");
        //Declare variable of type int and read it from the keyboard
        int m = sc.nextInt();
//        sc.nextLine();
        //Display prompt
        System.out.print("Enter the base price per kg (in cents): ");
        //Declare variable of type int and read it from the keyboard
        int basePrice = sc.nextInt();
        //Declare 2D array of type int and set the number of elements for rows to n and for columns to m
        int[][] weights = new int[n][m];

        //Method for displaying the fish weights
        printWeights(weights, sc);
        //Displays section title
        System.out.println("\n<=== Updated prices (in cents) ===>");
        //Display updated prices after calling the method
        System.out.println(Arrays.deepToString(updateFishPrices(weights, basePrice)));
        
    }

    //Define method for reading and displaying the weights
    static void printWeights(int[][] weights, Scanner sc) {
        //Display section title for Matrix 1
        System.out.println("\n<=== Fish weights ===>");
        //Loop from i = 0 to length of the array, incrementing i by 1
        for (int i = 0; i < weights.length; i++) {
            //Display prompt for entering the elements for each row
            System.out.println("Enter the weight of each fish in grams: ");
            //Inside this loop --> loop from j = 0 to length of each row, incrementing j by 1
            for (int j = 0; j < weights[i].length; j++) {
                //Display label for element
                System.out.print("Weight of fish " + (j + 1) + ": ");
                //Read the element from the keyboard
                weights[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }
    }

    //Define method for updating the prices
    public static int[][] updateFishPrices(int[][] fishWeights, int basePricePerKg) {
        // Initialize the result array with the same dimensions
        int rows = fishWeights.length;
        int cols = fishWeights[0].length;
        int[][] updatedPrices = new int[rows][cols];

        //Nested loops to traverse the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int weight = fishWeights[i][j];
                double multiplier = 1.0;

                //Determine the premium based on weight thresholds
                if (weight >= 500 && weight < 1000) {
                    multiplier = 1.10; // 10% premium
                } else if (weight >= 1000) {
                    multiplier = 1.20; // 20% premium
                }

                //Calculate price: (weight in kg) * (base price * premium)
                //Use double for calculation to maintain precision before rounding down
                double finalPrice = (weight / 1000.0) * (basePricePerKg * multiplier);

                //Round down to the nearest integer (cast to int)
                updatedPrices[i][j] = (int) finalPrice;
            }
        }
        //Return the updated price
        return updatedPrices;
    }
}