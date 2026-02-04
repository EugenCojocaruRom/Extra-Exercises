import org.w3c.dom.Text;

import java.util.ArrayList;
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
        //Display prompt for user
        System.out.println("Enter the words: ");
        //Declare array of type String and set the number of its elements to n
        String[] words = new String[n];

        //Call method for reading and displaying the words
        wordsArray(words, sc);
        //Call method for finding only the words that have at least 5 characters
        findWords(words);
    }

    //Method for reading and displaying the words
    static void wordsArray(String[] text, Scanner sc) {
        for (int i = 0; i < text.length; i++) {
            System.out.print("Word [" + (i + 1) + "]: ");
            text[i] = sc.nextLine();
        }
        System.out.println("The words are: " + Arrays.toString(text));
    }

    //Method for finding only the words that have at least 5 characters
    static void findWords(String[] text) {
            //version 1 - using arrays
        //Declare variable of type int (counter) and initialize it
        int counter = 0;
        //Loop from i = 0 to the length of the initial array, incrementing i by 1
        for (int i = 0; i < text.length; i++) {
            //Set condition to check the length of each word in the initial array
            if (text[i].length() >= 5) {
                //Increment the counter at each word that meets the condition
                counter++;
            }
        }
        //Declare array of type String and set the number of its element to the value of 'counter'
        String[] newText = new String[counter];
        //Declare variable of type int (index) and initialize it
        int index = 0;
        //Loop from i = 0 to the length of the initial array, incrementing i by 1
        for (int i = 0; i < text.length; i++) {
            //Set condition to check the length of each word in the initial array
            if  (text[i].length() >= 5) {
                //Place the word that meets the condition at the next index in the 'newText' array
                newText[index] = text[i];
                //Increment the index
                index++;
            }
        }
        //Display the sorted words
        System.out.println("The words with more than 5 characters are: " + Arrays.toString(newText));

            // ===============================
            //version 2 - using ArrayList
        //Declare ArrayList of type String to store the sorted words
        ArrayList<String> fiveCharWords = new ArrayList<String>();
        //Loop from i = 0 to the length of the initial array, incrementing i by 1
        for (int i = 0; i < text.length; i++) {
            //Set condition to check the length of each word in the initial array
            if (text[i].length() >= 5) {
                //Add the word to the ArrayList if it meets the condition
                fiveCharWords.add(text[i]);
            }
        }
        //Display the sorted words
        System.out.println("The words with more than 5 characters are: " + fiveCharWords);
    }
}