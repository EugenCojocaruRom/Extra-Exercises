import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value x
        System.out.print("n = ");
        //Declare variable n of type int and read it from the keyboard
        int n = sc.nextInt();

        //Declare ArrayList A of type string, which the calls the 'FizzBuzz' method
        ArrayList<String> A = FizzBuzz(n);
        //Display the modified values of array A
        System.out.print("\nThe FizzBuzz values of list A are: " + A);
    }

    //Define the method for modifying numbers that are multiples of 3, of 5, or of both
    static ArrayList<String> FizzBuzz(int n) {
        //Declare new ArrayList of type string, which will hold the modified values
        ArrayList<String> newList = new ArrayList<>();
        //Loop through 'newList' from i = 1 to the exact value of n (the number of elements in the ArrayList), incrementing i by 1
        for (int i = 1; i <= n; ++i) {
            //Set the condition for replacing multiples of both 3 and 5 with 'FizzBuzz'
            if (i%3 == 0 && i%5 == 0) {
                newList.add("FizzBuzz");
            }
            //Set the condition for replacing multiples of 3 with 'Fizz'
            else if (i%3 == 0) {
                newList.add("Fizz");
            }
            //Set the condition for replacing multiples of 5 with 'Buzz'
            else if (i%5 == 0) {
                newList.add("Buzz");
            }
            //If none of the conditions above are met, add the value of the number itself
            else {
                newList.add(String.valueOf(i));
            }
        }
        return newList;
    }
}