import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value 'n' for the string
        System.out.print("n = ");
        //Declare variable 'n' of type string and read it from the keyboard
        String n = sc.nextLine();

        reverseString(n);
    }

    //Define method for reversing the string
    static void reverseString(String n) {
        //Declare variable 'rev' of type string and set it to empty
        String rev = "";
        //Loop through the string from i = 0 to the length of the string, incrementing i by 1
        for (int i = 0; i < n.length(); i++) {
            //Add each value of i to 'rev'
            rev = n.charAt(i) + rev;
        }
        System.out.print("The reversed string is: " + rev);
    }
}