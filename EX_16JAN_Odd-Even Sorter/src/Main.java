import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declare ArrayLists for storing the even and odd numbers
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display message for user to enter the number of elements
        System.out.print("Enter the number of elements in the list: ");
        //Declare variable of type int an read it from the keyboard
        int num = sc.nextInt();
        //Declare array of type int and set the number of its elements to the value of 'num'
        int[] numsList  = new int[num];

        //Method for reading and displaying the list
        displayNumbers(numsList, sc);
        //Method for displaying the sorted odd and even numbers into the corresponding lists
        sortNumbers(numsList, oddNumbers, evenNumbers);
    }

    //Define method for reading and displaying the list with all the numbers
    static void displayNumbers(int[] list, Scanner sc) {
        //Loop through the list of numbers from i = 0 to the length of the list, incrementing i by 1
        for (int i = 0; i < list.length; i++) {
            //Display each element from the list
            System.out.print("Number[" +  i + "] = ");
            //Read the element from the keyboard
            list[i] = sc.nextInt();
        }
        //Display the list with all the numbers
        System.out.println("The list of numbers is: " + Arrays.toString(list));
    }

    //Define the method for sorting the numbers into odd and even
    static void sortNumbers(int[] list, ArrayList<Integer> oddNumbers, ArrayList<Integer> evenNumbers) {
        //Loop through the list of numbers from i = 0 to the length of the list, incrementing i by 1
        for  (int i = 0; i < list.length; i++) {
            //Set the condition for determining if a number is odd or even and add it to the correct list
            if (list[i] % 2 == 0) {
                evenNumbers.add(list[i]);
            }
            else {
                oddNumbers.add(list[i]);
            }
        }
        //Display the lists of odd numbers
        System.out.print("The odd numbers are: " + oddNumbers);
        //Display the list of even numbers
        System.out.print("\nThe even numbers are: " + evenNumbers);
    }
}