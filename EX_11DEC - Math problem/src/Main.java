import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        //Declare an array of type int, with a range from 1 to 85
        int[] A = IntStream.rangeClosed(1, 100).toArray();
        //Display the message with the values of n
        System.out.print("If n can have values from 1 to 100");
        //Declare variable 'counter' of type int and initialize it
        int counter = 0;
        //Display the message with the formula of calculation
        System.out.print("\nand the formula of calculation is 5 + (n - 1) * 3,\nthen the numbers divisible by 7 are: \n");
        //Loop through array A from i = 0 to the length of A, incrementing 1 by 1
        for (int i = 0; i < A.length; i++) {
            //Set the formula to compute the numbers that will be divided by 7
            int result = 5 + (A[i] - 1) * 3;
            //Set the condition for the numbers to be divisible exactly by 7
            if (result % 7 == 0) {
                //Increment the counter when the condition above is satisfied
                counter++;
                //Display the numbers that can be divided by 7
                System.out.print(result + ", ");
            }
        }
        //Display the result (value of numbers that can be divided by 7)
        System.out.println("\nThis means that " + counter + " numbers are divisible by 7");

    }
}