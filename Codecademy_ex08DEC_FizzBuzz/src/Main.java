import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value x
        System.out.print("n = ");
        //Declare variable n of type int and read it from the keyboard --> this is the number of elements in the string
        int n = sc.nextInt();

        //Declare string A, which calls the 'FizzBuzz' method
        String A = FizzBuzz(n);
        //Display the values of array A
        System.out.print("\nThe FizzBuzz values are: " + A + "\n");
    }

    //Define the 'FizzBuzz' method
    static String FizzBuzz(int n) {
        //Declare variable of type String, which will start up as empty, as it will be used to store the modified values
        String modString = "";
        //Loop through n from i = 1 to the exact value of n, incrementing i by 1
        for (int i = 1; i <= n; ++i) {
            //Set the condition for replacing multiples of both 3 and 5 with 'FizzBuzz'
            if (i%3 == 0 && i%5 == 0) {
                //The element that meets the condition is added to the modified string
                modString = modString + "FizzBuzz";
            }
            //Set the condition for replacing multiples of 3 with 'Fizz'
            else if (i%3 == 0) {
                //The element that meets the condition is added to the modified string
                modString = modString + "Fizz";
            }
            //Set the condition for replacing multiples of 5 with 'Buzz'
            else if (i%5 == 0) {
                //The element that meets the condition is added to the modified string
                modString = modString + "Buzz";
            }
            //If none of the conditions above are met, add the value of the number itself to the string
            else {
                modString = modString + i;
            }
            //Add a comma after each element, except after the last value of n
            if (i < n) {
                modString = modString + ", ";
            }
        }
        return modString;
    }
}