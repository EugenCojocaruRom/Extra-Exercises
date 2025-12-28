import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value 'n' for the number to be analyzed
        System.out.print("n = ");
        //Declare variable 'n' of type int and read it from the keyboard
        int n = sc.nextInt();

        //Display the prime factors of n
        System.out.print("The prime factors of " + n + " are: ");
        //Call the method for the sum of the prime factors of n
        System.out.println("\nThe sum of the prime factors is " + sumOfPrimeFactors(n));
    }

    //Define method for determining the prime factors and calculating their sum
    static int sumOfPrimeFactors(int n) {
        //Declare variable 'sum' of type int and initialize it
        int sum = 0;
        //Set the rule for the case when the number has 2 as a factor
        while (n % 2 == 0) {
            //Display the number of 2's that divide n
            System.out.print(2 + ", ");
            //Calculate the sum of the prime factors
            sum = sum + 2;
            //Keep dividing n to 2
            n = n / 2;
        }
        //Loop through the remaining number (odd) from i = 3 to the square root of n, incrementing i by 2
        for (int i = 3; i * i <= n; i = i + 2) {
            //Set the rule for the division of n by the value of i
            while (n % i == 0) {
                //Display the values that divide n
                System.out.print(i + ", ");
                //Calculate the sum of the prime factors
                sum = sum + i;
                //Keep dividing n by the values of i
                n = n / i;
            }
        }
        //Set the condition for the case when, after the loop, if n is still > 2, then n itself is a prime factor
        if  (n > 2) {
            //Display the number
            System.out.print(n);
            //Calculate the sum of the prime factors
            sum = sum + n;
        }
        //Return the sum of the prime factors
        return sum;
    }
}