import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers separated by comma: ");
        String text = scanner.nextLine();
        String[] arrString = text.split(",");
        int[] numbers = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
            numbers[i] = Integer.parseInt(arrString[i]);
        }
        double[] stats = calculateStats(numbers);
        System.out.println("Sum: " + stats[0]);
        System.out.println("Average: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
        System.out.println("Minimum: " + stats[3]);
    }

    //Method for performing operations
    public static double[] calculateStats(int[] arr) {
        //1. Sum
        //Declare variable of type double (sum) and initialize it
        double sum = 0;
        //Loop from i = 0 to the length of the array, incrementing i by 1
        for (int i = 0; i < arr.length; i++) {
            //Add the current element to the sum at each iteration
            sum += arr[i];
        }
        //2. average
        //Declare variable of type double (average) and calculate it by dividing the sum to the number of elements in the array
        double average = sum / arr.length;
        //3. Max number
        //Declare variable of type double (max number) and initialize it as the first element of the array
        double max = arr[0];
        //Loop through each element of the array
        for (int i = 1; i < arr.length; i++) {
            //Set condition to check if the current element is bigger than the max number
            if (arr[i] > max) {
                //Set the max number as the current element if the condition is satisfied
                max = arr[i];
            }
        }
        //4. Min number
        //Declare variable of type double (min number) and initialize it as the first element of the array
        double min = arr[0];
        //Loop through each element of the array
        for (int i = 1; i < arr.length; i++) {
            //Set condition to check if the current element is smaller than the min number
            if (arr[i] < min) {
                //Set the min number as the current element if the condition is satisfied
                min = arr[i];
            }
        }
        //Declare array of type double to store the 4 results above: sum, average, max, min
        double[] results = {sum, average, max, min};
        //Return the array values
        return results;
    }
}