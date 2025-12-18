import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value n
        System.out.print("n = ");
        /*Declare variable of type int and read it from the keyboard
        --> for the number of values array A will have*/
        int n = sc.nextInt();
        //Add extra sc.nextLine to consume the leftover newline
        sc.nextLine();
        //Declare array of type string and set the number of its elements to n
        String[] A = new String[n];

        //Method for reading A
        readA(A, sc);
        //Method for displaying A
        displayA(A);
        //Method for finding the longest common prefix
        commonPref(A);

    }

    //Define method for reading array A
    static void readA(String[] A, Scanner sc) {
        //Loop through array A from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; ++i) {
            //Display each element of array A
            System.out.print("A[" + i + "] = ");
            //Read each element of array A from the keyboard
            A[i] = sc.nextLine();
        }
    }

    //Define method for displaying array A
    static void displayA(String[] A) {
        //Display the first part of the message for array A
        System.out.print("\nThe elements of array A are: ");
        //Loop through array A from i = 0 to the length of A, incrementing i by 1
        for (int i = 0; i < A.length; ++i) {
            //Display all the elements of array A
            System.out.print(A[i] + ", ");
        }
    }

    //Define method for finding the longest common prefix
    static void commonPref(String[] A) {
        //Conditions for the case when the array is null or empty (the value entered for n is 0)
        if (A == null || A.length == 0) {
            //Display message that there is no prefix
            System.out.print("none.\nThere is no prefix in this case.\n");
            //Exit the method if no result is found
            return;
        }
        //Declare variable of type string to store the value of the common prefix
        String pref = "";
        /*Loop through each character of the first element of array A (A[0]),
        from i = 0 to the length of A[0], incrementing i by 1
         */
        for (int i = 0; i < A[0].length(); ++i) {
            /*Declare variable of type char and set it to be retrieved from
            the position indicated by index i of the first string*/
            char currChar = A[0].charAt(i);
            /*Loop through the other strings of array A, but starting at index 1 (j=1),
            since position 0 (A[0]) was already checked*/
            for (int j = 1; j < A.length; ++j) {
                /*Set the conditions for finding the prefix:
                1. the end of the string being checked has been reached
                2. the character at position 1 does not match the current character*/
                if (i >= A[j].length() || A[j].charAt(i) != currChar) {
                    //Display the message containing the prefix found if either condition is true
                    System.out.print("\nThe common prefix is: " + pref);
                //Exit the method
                    return;
                }
            }
        //The characters found in all the strings at the same index i are added to the prefix string
            pref = pref + currChar;
        }
        //Display the message containing the prefix
        System.out.print("\nThe common prefix is: " + pref);
    }
}