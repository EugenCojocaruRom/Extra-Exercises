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
        System.out.print("The original string is " + n + "\n");
        //Declare variable of type string for reversed string
        String revA = "";
        //Convert string A to char array
        char[] B = A.toCharArray();
        //Loop through string n from i = B.length to the beginning of the string, decrementing i by 1
        for (int i = B.length-1; i >= 0; --i) {
            //Set method for reversing string A
            revA = revA + B[i];
        }
        //Display reversed string
        System.out.print("\nThe reversed string is: " + revA);
    }
}