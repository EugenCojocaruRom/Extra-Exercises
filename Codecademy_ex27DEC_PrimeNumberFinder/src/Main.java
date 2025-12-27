import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value 'n' for the number to be analyzed
        System.out.print("n = ");
        //Declare variable 'n' of type int and read it from the keyboard
        int n = sc.nextInt();

        //Display the message for the prime numbers up to value n
        System.out.println("The prime numbers up to " + n + " are: ");
        //Call the method for displaying the prime numbers
        displayPrime(n);
    }

    //Define method for displaying each prime number up to value n
    static void displayPrime(int n){
        //Loop through the value of n from i = 2 to the value of n, incrementing i by 1
        for (int i = 2; i <= n; i++) {
            //Call the primeFinder method in case a prime number has been found
            if (primeFinder(i)) {
                //Display the prime number
                System.out.print(i + " ");
            }
        }
        //Display empty line
        System.out.println();
    }

    //Define method for finding the prime numbers
    static boolean primeFinder(int n){
        //Set the rule for values smaller than or equal to 1
        if (n < 2) {
            //Return false vor values smaller than or equal to 1
            return false;
        }
        //Check the numbers from i = 2 to the max value of the number, incrementing i by 1
        for (int i = 2; i < n; i++) {
            //Set the rule for determining if it is an even number
            if (n % i == 0) {
            //Return false for even numbers
                return false;
            }
        }
        //Return true if the number is prime
        return true;
    }
}