import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt for user
        System.out.print("Enter the number of words: ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        sc.nextLine();
        //Declare array of type String and set the number of its elements to n
        String[] words = new String[n];

        //Method for reading and displaying the array of strings
        displayArray(n, words, sc);
        //Method for finding the common prefix
        commonPrefix(words);
    }

    //Define the method for reading and displaying the array of strings
    public static void displayArray(int n, String[] arr, Scanner sc) {
        //Set condition for the case when n = 0
        if (n == 0) {
            //Display message
            System.out.println("The number of words cannot be 0.");
            //Exit if statement
            return;
        }
        //Loop from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < arr.length; i++) {
            //Display label for each element (string) of the array
            System.out.print("Word " + (i + 1) + ": ");
            //Read each element from the keyboard
            arr[i] = sc.nextLine();
        }
        //Display the array of words
        System.out.println("The words are the following: " + Arrays.toString(arr));
    }

    //Define the method for finding the common prefix of the words in the array
    public static void commonPrefix(String[] arr) {
        //Check that the array if not null or empty
        if (arr == null || arr.length == 0) {
            //Display a message informing there is no string to display
            System.out.println("Nothing to display.");
            //Exit if statement
            return;
        }
        //Declare variable of type StringBuilder for storing the prefix
        StringBuilder prefix = new StringBuilder();
        //Loop through the characters of the first element of the array from i = 0 to the length of the word, incrementing i by 1
        for (int i = 0; i < arr[0].length(); i++) {
            //Set the current character at the position indicated by index i of the first element
            char currentChar = arr[0].charAt(i);
            //Inside this loop, loop from j = 1 to the length of the array, incrementing j by 1
            for (int j = 1; j < arr.length; j++) {
                //Set the conditions for finding the common prefix:
                    //1. reached the end of the element being checked
                    //2. the character at position i does not match the current character
                if (i >= arr[j].length() || arr[j].charAt(i) != currentChar) {
                    //Display the common prefix
                    System.out.println("The common prefix is: " + prefix);
                    //Exit the loop
                    return;
                }
            }
            //Append the current character to the prefix
            prefix.append(currentChar);
        }
        //Display the common prefix
        System.out.println("The common prefix is: " + prefix);
    }
}