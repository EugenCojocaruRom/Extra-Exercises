import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Declare list of type Integer, containing several ints
        List<Integer> numbers = (List.of(1, 2, 3, 4, 5));
        //Display the 2 lists
        System.out.println("List 1 is: " + numbers);
        System.out.println("List 2 (after adding 1 and multiplying by 10) is: " + math1(numbers)); //Call the method

        //Display separator line
        System.out.println("====================");

        //Declare list of type Integer, containing several ints
        List<Integer> positiveNumbers = (List.of(16, 0, 3185, 10, 886, 68, 1, 5));
        //Display the 2 lists
        System.out.println("List 1 is: " + positiveNumbers);
        System.out.println("List 2 (with the rightmost digit) is: " + rightNumber(positiveNumbers)); //Call the method
    }

    //Method for adding 1 to each number from the original array, and then multiply by 10
    public static List<Integer> math1(List<Integer> numbers) {
        //Declare new list of type Integer, empty, for storing the new values
        List<Integer> numbers2 = new ArrayList<>();
        //Loop through the original list
        for (Integer number : numbers) {
            //Add 1 to each number from the original list, and then multiply by 10, and then add the result to the new list
            numbers2.add((number + 1) * 10);
        }
        //Return the new list
        return numbers2;
    }

    //Method for finding the rightmost digit of every int
    public static List<Integer> rightNumber(List<Integer> numbers) {
        //Declare new list of type Integer, empty, for storing the new values
        List<Integer> numbers3 = new ArrayList<>();
        //Loop through the original list
        for (Integer number : numbers) {
            //Divide each number from the original list to 10 and add the remainder to the new list
            numbers3.add(number % 10);
        }
        //return the new list
        return numbers3;
    }
}