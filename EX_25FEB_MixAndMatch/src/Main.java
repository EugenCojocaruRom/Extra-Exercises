import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt
        System.out.print("Enter number of ingredients: ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        sc.nextLine();
        //Display prompt
        System.out.print("Enter number of seasonings: ");
        //Declare variable of type int and read it from the keyboard
        int m = sc.nextInt();
        sc.nextLine();
        //Declare array of type string and set the number of its elements to n
        String[] ingredients = new String[n];
        //Declare array of type string and set the number of its elements to m
        String[] seasonings = new String[m];

        //Call method for reading and displaying the ingredients
        System.out.print("\n<=== Ingredients ===>\n");
        displayIngredients(ingredients, sc);
        //Call method for reading and displaying the seasonings
        System.out.print("\n<=== Seasonings ===>\n");
        displaySeasonings(seasonings, sc);
        //Call method for creating ingredient/seasoning mix and display it as a string
        System.out.println(Arrays.deepToString(createFlavorMix(ingredients, seasonings)));
    }

    //Define method for reading and displaying the ingredients and seasonings
    static void displayIngredients(String[] ingredients, Scanner sc) {
        //Loop from i = 0 to length of ingredients, incrementing i by 1
        for (int i = 0; i < ingredients.length; i++) {
            //Display prompt for each element of the array
            System.out.print("Ingredient " + (i + 1) + ": ");
            //Read each value from the keyboard
            ingredients[i] = sc.nextLine();
        }
    }

    //Define method for reading and displaying the ingredients and seasonings
    static void displaySeasonings(String[] seasonings, Scanner sc) {
        //Loop from i = 0 to length of seasonings, incrementing i by 1
        for (int i = 0; i < seasonings.length; i++) {
            //Display prompt for each element of the array
            System.out.print("Seasoning " + (i + 1) + ": ");
            //Read each value from the keyboard
            seasonings[i] = sc.nextLine();
        }
    }

    //Define method for creating ingredient/seasoning mix
    public static String[][] createFlavorMix(String[] mainIngredients, String[] seasonings) {
        //Declare bidimensional array of type String and set the number of its elements to the length of array 'mainIngredients' and length of array 'seasonings'
        String[][] flavorMix = new String[mainIngredients.length][seasonings.length];
        //Loop from i = 0 to length of mainIngredients, incrementing i by 1
        for (int i = 0; i < mainIngredients.length; i++) {
            //Inside this loop - loop from j = 0 to length of seasonings, incrementing j by 1
            for (int j = 0; j < seasonings.length; j++) {
                //Assign to each element of 2D array 'flavorMix' the combined value of mainIngredients[i] and seasonings[j]
                flavorMix[i][j] = mainIngredients[i] + " + " + seasonings[j];
            }
        }
        //Return the 2D array
        return flavorMix;
    }
}