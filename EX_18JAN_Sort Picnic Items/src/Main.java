import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display title
        System.out.println("Picnic list");
        //Display separator
        System.out.println("=============");
        //Display label for number of items
        System.out.print("Number of items: ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        sc.nextLine();
        //Declare array of type string and set the number of its elements to n
        String[] picnicItems = new String[n];

        //Method for sorting the picnic items
        System.out.println("These are your picnic items: " + Arrays.toString(sortItems(picnicItems, sc)));
    }

    //Define method for sorting and displaying the list in alphabetical order
    static String[] sortItems(String[] picnicItems, Scanner sc) {
        //Display message for the user
        System.out.println("Enter an item: ");
        //Loop through the array from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < picnicItems.length; i++) {
            //Display each item
            System.out.print("Item " + (i + 1) + ": ");
            //Read the item from the keyboard
            picnicItems[i] = sc.nextLine();

        }
        //Sort the elements of the array
        Arrays.sort(picnicItems);
        return picnicItems;
    }
}