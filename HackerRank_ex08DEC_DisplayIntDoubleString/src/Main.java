import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display request for entering the value for the integer
        System.out.print("Enter int: ");
        //Declare variable og type int and read it from the keyboard
        int i = sc.nextInt();
        //Display request for entering the value for the double
        System.out.print("Enter double: ");
        //Declare variable of type double and read it from the keyboard
        double d = sc.nextDouble();
        /* --> Add extra nextLine() to consume the newline character (\n)
        in the input buffer of nextDouble()/nextInt()*/
        sc.nextLine();
        //Display request for entering the value for the string
        System.out.print("Enter string: ");
        //Declare variable of type string and read it from the keyboard
        String s = sc.nextLine();

        //Display the values of each variable as entered from the keyboard
        System.out.println("\nString: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}