import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value 'n' for the number of elements in the array
        System.out.print("n = ");
        //Declare variable 'n' of type int and read it from the keyboard
        int n = sc.nextInt();
        //Declare array 'nums' of type int
        int[] nums;
        //Set the number of elements in the array to 'n'
        nums = new int[n];

        //Method for reading and displaying the array
        readNums(nums, sc);
        //Method for finding the elements with value 3 and their positions in the array
        System.out.println(haveThree(nums));
    }

    //Define method for reading and displaying the array
    static void readNums(int[] nums, Scanner sc) {
        //Loop through the array from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < nums.length; i++) {
            //Display each element of the array
            System.out.print("nums[" + i + "] = ");
            //Read each element from the keyboard
            nums[i] = sc.nextInt();
        }
        //Display the array with all its elements
        System.out.print("The elements of the array are: " + Arrays.toString(nums) + "\n");
    }

    //Define method for finding the elements with value 3 and their positions in the array
    static boolean haveThree(int[] nums) {
        //Declare variable 'count' of type int and initialize it
        int count = 0;
        //Loop through the array from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < nums.length; i++) {
            //Set the condition for checking if a value is 3
            if (nums[i] == 3) {
                //Increment the counter for each 3 found
                count++;
                //Inside the same 'if', check the remaining values for any 3's that are adjacent
                if (i < nums.length - 1 && nums[i + 1] == 3) {
                //Return 'false' if any adjacent 3's are found
                return false;
                }
            }
        }
        //Return 'true' only if exactly 3 values of 3 have been found
        return count == 3;
    }
}