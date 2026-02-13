import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt - number of soldiers
        System.out.print("Enter the number of soldiers: ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        sc.nextLine();
        //Display prompt - the m-th soldier to be eliminated
        System.out.print("Enter the elimination step: ");
        //Declare variable of type int and read it from the keyboard
        int m = sc.nextInt();

        //Call method for calculating the soldiers to be eliminated and the survivor
        josephusWithNumbers(n, m);
    }

    //Define the method for calculating the soldiers to be eliminated and the survivor
    static void josephusWithNumbers(int n, int m) {
        //Declare and create the list of initial soldiers numbered 1 to n
        List<Integer> initialSoldiers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            initialSoldiers.add(i);
        }

        //Declare and create the list of eliminated soldiers
        List<Integer> eliminatedSoldiers = new ArrayList<>();
        //Declare variable of type int for the current index and initialize it
        int currentIndex = 0;

        //Display initial number of soldiers and elimination step
        if (m == 2) {
            System.out.println("Starting with " + n + " soldiers, eliminating every " + m + "nd soldier");
        }
        else if (m == 3) {
            System.out.println("Starting with " + n + " soldiers, eliminating every " + m + "rd soldier");
        }
        else {
            System.out.print("Starting with " + n + " soldiers, eliminating every " + m + "th soldier");
        }
        //Display initial soldier count
        System.out.println("Initial soldiers: " + initialSoldiers);
        //Display separator
        System.out.println("<===================>");
        //Declare variable of type int (elimination step) and initialize it at 1
        int step = 1;
        //Loop through the number of initial soldiers (while loop)
        while (initialSoldiers.size() > 1) {
            //Count m positions (m-1 steps from the current index) (e.g. soldier at position 1 (i.e. index 0) - soldier to be eliminated at position 3 (i.e. index 2 <-- m-1))
            //The modulo operator is used to be able to re-start counting from the beginning of the list
            currentIndex = (currentIndex + m - 1) % initialSoldiers.size();
            //Declare variable of type int and set its value as the current index from the initialSoldiers list (for the next soldier to be eliminated)
            int nextForElimination = initialSoldiers.get(currentIndex);
            //Declare variable of type int (eliminated soldier) and set its value as the soldier at the current index, removed from the initial soldiers list
            int eliminated = initialSoldiers.remove(currentIndex);
            //Add the eliminated soldier to the eliminated soldiers list
            eliminatedSoldiers.add(eliminated);

            //Display the current step, the next soldier to be eliminated (current index + 1), the eliminated soldier and the remaining soldiers
            System.out.println("Step " + step + ":");
            System.out.println("  Next soldier to be eliminated: " + nextForElimination + ", at position " + (currentIndex + 1));
            System.out.println("  Eliminated soldier: " + eliminated);
            System.out.println("  Remaining soldiers: " + initialSoldiers);
            System.out.println();

            //After eliminating a soldier, the currentIndex points to the next soldier (given that the element at currentIndex was removed, so all the remaining elements shifted to the left)
            //Set condition for the case when the last element in the list is eliminated and to prevent attempting to access an empty list
            if (currentIndex >= initialSoldiers.size() && initialSoldiers.size() > 0) {
                //The current index is 're-set' to 0
                currentIndex = 0;
            }
        //Increment the elimination step count after each iteration
        step++;
        }
        //Declare variable of type int (surviving soldier) and set its value as the value at index 0
        int survivor = initialSoldiers.get(0);
        //Display separator
        System.out.println("<=============>");
        //Display the eliminated soldiers (in the order of elimination)
        System.out.println("Eliminated soldiers: " + eliminatedSoldiers);
        //Display the surviving soldier
        System.out.println("Last soldier standing: " + survivor);
    }
}