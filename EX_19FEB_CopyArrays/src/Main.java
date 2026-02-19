import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner scanner = new Scanner(System.in);
        //Display prompt
        System.out.print("Elements of array 1 (separated by comma): ");
        //Declare variable of type String and read it from the keyboard
        String textArr1 = scanner.nextLine();
        //Display prompt
        System.out.print("Elements of array 2 (separated by comma): ");
        //Declare variable of type String and read it from the keyboard
        String textArr2 = scanner.nextLine();
        //Declare array of type String and split its elements by comma
        String[] arr1 = textArr1.split(",");
        //Declare array of type String and split its elements by comma
        String[] arr2 = textArr2.split(",");

        //Declare array of type string (array 1 merges with array 2) and call the 'merge' method
        String[] mergedArray = merge(arr1, arr2);
        //Display the merged array
        System.out.println(Arrays.toString(mergedArray));
    }

    //Define method for merging the arrays
    static String[] merge(String[] arr1, String[] arr2) {
        //Declare array of type String and set the number of its elements as the sum of the elements of the other 2 arrays
        String[] arr3 = new String[arr1.length + arr2.length];
        //Copy the elements of array 1 into array 3
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        //Copy the elements of array 2 into array 3, after the elements of array 1
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        //Sort the elements of array3
        Arrays.sort(arr3);
        //Return the merged array
        return arr3;
    }
}