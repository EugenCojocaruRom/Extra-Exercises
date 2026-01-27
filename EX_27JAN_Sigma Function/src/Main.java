import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner scanner = new Scanner(System.in);
        //Display prompt for the user
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        //Declare variable of type int, with the value retrieved by the 'sigma' method
        int res = sigma(n);
        //Display the result
        System.out.println("Sigma result: " + res);
    }

    //Sigma method - addition
    public static int sigma(int n) {
        //Declare variable of type int and initialize it
        int sum = 0;
        //Loop from i = 0 to n, incrementing i by 1
        for (int i = 1; i <= n; i++) {
            //Add each element to the sum, at each iteration; display each step
            System.out.println("Step " + i + ": " + sum + " + " + i + " = " + (sum += i));
        }
        //Return the sum
        return sum;
    }
}