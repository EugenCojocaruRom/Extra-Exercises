import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display label for main string
        System.out.print("Haystack = ");
        //Declare variable of type string and read it from the keyboard
        String haystack = sc.nextLine();
        //Display label for string to look for in the main string
        System.out.print("Needle = ");
        //Declare variable of type string and read it from the keyboard
        String needle = sc.nextLine();

        //Method for looking for 'needle' in 'haystack'
        System.out.print("The needle is at index " + indexNeedle(haystack, needle) + " of the haystack");
    }

    //Method for searching for 'needle' in 'haystack'
    static int indexNeedle(String haystack, String needle) {
        //Declare variables for the lengths of the 2 strings
        int hlen = haystack.length();
        int nlen = needle.length();
        //Set condition for needle empty
        if (needle.isEmpty()) {
            return 0;
        }
        //Set condition for needle longer than haystack
        if (nlen > hlen) {
            return -1;
        }
        //Loop through the possible starting position in haystack
        for (int i = 0; i <= hlen - nlen; i++) {
            //Declare variable of type int - counter for matching characters
            int j = 0;
            //Set the conditions for looping through the characters of the 2 strings
            while (j < nlen && haystack.charAt(i + j) == needle.charAt(j)) {
                //Increment j by 1 to move to the next character
                j++;
            }
            //Set the condition for comparing the counter j (characters matched) to the length of needle
            if (j == nlen) {
                //Return the index where the match was found
                return i;
            }
        }
        //Return -1 if no match has been found
        return -1;
    }
}