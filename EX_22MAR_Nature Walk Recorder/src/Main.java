import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt - number of observations
        System.out.print("Enter number of observations: ");
        //Declare variable of type in and read it from the keyboard
        int n = sc.nextInt();
        //Declare array of type int and set the number of elements to n (to hold all the observation codes)
        int[] observations = new int[n];
        //Display prompt - enter observation code as indicated
        System.out.println("Enter each observation code (1=tree, 2=flower, 3=bird, 4=squirrel, 5=butterfly): ");
        //Loop from i = 0 to n, incrementing i by 1
        for (int i = 0; i < n; i++) {
            //Display prompt - enter the current observation
            System.out.print("  Observation " + (i + 1) + ": ");
            //Read the entered value from the keyboard and store it in the array
            observations[i] = sc.nextInt();
        }
        //Display prompt - enter pattern as indicated
        System.out.print("Enter pattern (1=normal, 2=reverse, 3=alternating): ");
        //Declare variable of type int and read it from the keyboard
        int pattern = sc.nextInt();
        //Declare array of type String for the result and assign to it the values retrieved by the called method
        String[] result = natureWalkRecorder(observations, pattern);
        //Display the final result as a string
        System.out.println("Result: " + java.util.Arrays.toString(result));
    }

    //Define method for recording the observations
    static String[] natureWalkRecorder(int[] observations, int pattern) {
        //Declare an empty linked list to store the observations
        LinkedList list = new LinkedList();
        //Loop through each element in the observations array
        for (int obs : observations) {
            //Append the current element to the end of the linked list
            list.addLast(obs);
        }
        //Check which pattern the user requested
        switch (pattern) {
            //Pattern 1: normal order — nothing to change
            case 1:
                //Exit the switch, list stays as is
                break;
            //Pattern 2: reverse the entire list
            case 2:
                //Use Collections utility to reverse the linked list in-place
                Collections.reverse(list);
                //Exit the switch
                break;
            //Pattern 3: swap every consecutive pair of elements
            case 3:
                //Declare iterator to move forward and backward
                ListIterator<Object> iterator = list.listIterator();
                //Keep going as long as there are elements ahead
                while (iterator.hasNext()) {
                    //Retrieve the first element of the current pair, advance cursor
                    Object first = iterator.next();
                    //Stop if no second element exists (odd-length list)
                    if (!iterator.hasNext()) break;
                    //Retrieve the second element of the pair, advance cursor
                    Object second = iterator.next();
                    //Perform swap: cursor is after 'second', so we write back in reverse order
                    iterator.set(first); //Overwrite the second position with the first value
                    iterator.previous(); //Move cursor back to the second position
                    iterator.previous(); //Move cursor back to the first position
                    iterator.set(second); //Overwrite the first position with the second value
                    iterator.next(); //Advance past the first position
                    iterator.next(); //Advance past the second position, ready for next pair
                }
                //Exit the switch
                break;
        }
        //Declare array of type String with the same size as the list
        String[] result = new String[list.size()];
        //Declare array of type String - this is the lookup table (e.g. index 0 = code 1, etc.)
        String[] names = {"tree", "flower", "bird", "squirrel", "butterfly"};
        //Declare variable of type int (counter) and initialize it
        int i = 0;
        //Loop through every element in the reordered list
        for (Object obs : list) {
            //Cast the element from Object to int
            int code = (int) obs;
            //If the code is out of range, stop and return what we have so far
            if (code < 1 || code > 5) break;
            //Assign code to name (code 1 -> index 0 -> "tree"), store in result
            result[i++] = names[code - 1];
        }
        //Return the result array
        return result;
    }
}