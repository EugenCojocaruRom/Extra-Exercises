import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner scanner = new Scanner(System.in);
        //Display prompt for the user
        System.out.println("Enter the elements of the array, separated by comma: ");
        //Declare variable of type string and read it from the keyboard
        String textArray = scanner.nextLine();
        //Display prompt for the user
        System.out.println("Enter the index of the element in the array: ");
        //Declare variable of type int and read it from the keyboard
        int index = scanner.nextInt();
        scanner.nextLine();
        //Display prompt for the user
        System.out.println("Enter the new value for the element: ");
        //Declare variable if type int and read it from the keyboard
        String newElement = scanner.nextLine();
        //Declare array of type string tha stores the elements separated by comma
        String[] arr = textArray.split(",");
        //Declare array of type string that will store the modified array after calling the 'changeElement' method
        String[] modifiedArr = changeElement(arr, index, newElement);
        //Loop through the modified array from i= 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < modifiedArr.length; i++) {
            //At each iteration, display the elements of the array separated by spaces
            System.out.print(modifiedArr[i] + " ");
        }
    }

    //Define the method for modifying the array
    public static String[] changeElement(String[] arr, int index, String newElement) {
        //Modify the array by accessing an element by using the 'index' argument, and then assign the newElement argument to that position
        arr[index] = newElement;
        //Return the modified array
        return arr;
    }
}