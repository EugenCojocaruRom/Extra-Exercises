import java.util.Scanner;

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
        System.out.print("The original string is: " + n + "\n");
        //Declare variable of type string for reversed string
        String revA = "";
        //Declare variable of type int for counting the number of letters in the word and initialize it
        int counter = 0;
        //Loop through the string from i = 0 to the length of the string, incrementing i by 1
        for (int i = 0; i < A.length(); ++i) {
            //Increment the counter after each iteration of i
            counter++;
            /*Set the method for reversing the string
            - each character is added at the beginning of revA after each loop through A*/
            revA = A.charAt(i) + revA;
        }
        //Display the reversed string
        System.out.print("The reversed string is: " + revA);
        /*Display the number of characters (including spaces) in the string
        --> just for fun, especially for long strings*/
        System.out.print("\nThe number of characters in this string is: " + counter);
    }
}