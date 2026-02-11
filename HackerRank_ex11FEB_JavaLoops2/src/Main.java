import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt for the user
        System.out.print("Enter the number of queries: ");
        //Declare variable of type int and read it from the keyboard
        int q = sc.nextInt();
        sc.nextLine();
        //Declare variables of type int and initialize them
        int a = 0, b = 0, n = 0;
        
        //Call method for calculating and displaying the results
        displayResults(q, a, b, n, sc);
    }
    
    //Define method for calculating and displaying the results
    static void displayResults(int q, int a, int b, int n, Scanner sc) {
        //Loop from i = 0 to the value of q, incremeing i by 1
        for (int i = 1; i <= q; i++) {
            //Display prompt for the user
            System.out.print("Enter element 'a': ");
            //Read variable 'a' from the keyboard
            a = sc.nextInt();
//            sc.nextLine();
            //Display prompt for the user
            System.out.print("Enter element 'b': ");
            //Read variable 'b' from the keyboard
            b = sc.nextInt();
//            sc.nextLine();
            //Display prompt for the user
            System.out.print("Enter element 'n': ");
            //Read variable 'n' from the keyboard
            n = sc.nextInt();
//            sc.nextLine();
            //Display the 3 values
            System.out.println(a + " " + b + " " + n);

            //Declare variable of type long for storing the sum of the powers of 2, and initialize it
            long sum = 0;
            //Loop from j = 0 to the value of n, incrementing j by 1
            for (int j = 0; j < n; j++) {
                //The result of 2 to the power of j is added to the sum at each iteration
                sum += Math.pow(2, j);
                //Declare variable of type long and set its value
                long result = a + (b * sum);
                //Display the result at each iteration
                System.out.print(result);
                //Add a space after each result, except the last one
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}