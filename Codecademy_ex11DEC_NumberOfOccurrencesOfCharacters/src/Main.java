import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value n
        System.out.print("n = ");
        //Declare variable n and read it from the keyboard
        String n = sc.nextLine();
        //Declare string A of type String
        String A = new String(n);
        //Display string
        System.out.print("The original string is " + n + "\n");
        //Convert the original string to an array of type char
        char[] B = A.toCharArray();
        /*Create a boolean array with the same length as the char array
        to mark if we've already a certain character; all initial values set as 'false'*/
        boolean[] C = new boolean[A.length()];

        //Method for checking the unique characters
        checkUnique(B, C);
    }

    //Define the method for checking whether the characters of the string are unique
    static void checkUnique(char[] B, boolean[] C) {
        //Display the first part of the message for the result
        System.out.print("The character count in this string is: \n");
        //Loop through the char array B from i = 0 to the length of B, incrementing i by 1
        for (int i = 0; i < B.length; ++i) {
            /*Start counting the characters from the first one in the array
            and mark them with boolean values as they are counted*/
            if (C[i] == true) {
                //If the first character was already counted, skip it and move to the next one
                continue;
            }
            /*Declare variable of type int for counter and initialize it at value 1
            (the next index after the first character, which we've already checked)*/
            int count = 1;
            /*Loop through the remaining characters of the char array
            (starting from i+1 (i.e. the character after the current one) to the length of B, incrementing j by 1),
            checking to see whether they are the same or not*/
            for (int j = i + 1; j < B.length; ++j) {
                //Set the condition to check if the characters match
                if (B[i] == B[j]) {
                    //The counter is incremented for each match
                    count++;
                    /*The position (index) is marked as 'true' in the boolean array*/
                    C[j] = true;
                }
            }
            //Display the resulting count of characters
            System.out.println(B[i] + " -> " + count);
        }
    }
}