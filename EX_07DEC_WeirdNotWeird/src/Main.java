import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value n
        System.out.print("n = ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        //Define the rules for printing 'Weird' / 'Not Weird'
        //If the number is odd
        if ((n % 2 == 1) || ((n % 2 == 0 && n >= 6 && n <= 20))) {
            //Print 'Weird' if the condition is met
            System.out.println("Weird");
        }
        //If the number is even and in the inclusive range 2-5
        if ((n % 2 == 0 && n >= 2 && n <5) || (n % 2 == 0 && n > 20)) {
            //Print 'Not Weird' if the condition is met
            System.out.println("Not Weird");
        }
    }
}