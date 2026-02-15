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
        //Display prompt - names of the soldiers
        System.out.println("Enter the names of the soldiers: ");
        //Declare and create list of type String and set the number of its elements to n
        List<String> soldierNames = new ArrayList<>(n);
        //Loop from i = 0 to n, incrementing i by 1
        for (int i = 0; i < n; i++) {
            //Add a name to the list at each iteration
            soldierNames.add(sc.next());
        }
        //Display prompt - the m-th soldier to be eliminated
        System.out.print("Enter the elimination step: ");
        //Declare variable of type int and read it from the keyboard
        int m = sc.nextInt();

        //Call method for calculating the soldiers to be eliminated and the survivor
        josephusWithNames(soldierNames, m);
    }

    //Define the method for calculating the soldiers to be eliminated and the survivor
    static void josephusWithNames(List<String> names, int m) {
        //Declare and create list of type String with the names of the soldiers
        List<String> soldierNames = new ArrayList<>(names);
        //Declare and create list of type String with the names of the eliminated soldiers and set it to empty (names will be added later)
        List<String> eliminatedSoldiers = new ArrayList<>();

        //Declare variable of type int for the current index and initialize it
        int currentIndex = 0;
        //Declare variable of type int (number of soldiers) and set its value as the size of the names list
        int n = names.size();

        //Display initial number of soldiers and elimination step
        if (m == 2) {
            System.out.println("Starting with " + n + " soldiers, eliminating every " + m + "nd soldier\n");
        }
        else if (m == 3) {
            System.out.println("Starting with " + n + " soldiers, eliminating every " + m + "rd soldier\n");
        }
        else {
            System.out.print("Starting with " + n + " soldiers, eliminating every " + m + "th soldier\n");
        }
        //Display initial soldier count
        System.out.println("Initial soldiers: " + soldierNames);
        //Display separator
        System.out.println("<===================>");
        //Declare variable of type int (elimination step) and initialize it at 1
        int step = 1;
        //Loop through the number of initial soldiers (while loop)
        while (soldierNames.size() > 1) {
            //Count m positions (m-1 steps from the current index) (e.g. soldier at position 1 (i.e. index 0) - soldier to be eliminated at position 3 (i.e. index 2 <-- m-1))
            //The modulo operator is used to be able to re-start counting from the beginning of the list
            currentIndex = (currentIndex + m - 1) % soldierNames.size();
            //Declare variable of type int and set its value as the current index from the soldierNames list (for the next soldier to be eliminated)
            String nextForElimination = soldierNames.get(currentIndex);
            //Declare variable of type int (eliminated soldier) and set its value as the soldier at the current index, removed from the initial soldiers list
            String eliminated = soldierNames.remove(currentIndex);
            //Add the eliminated soldier to the eliminated soldiers list
            eliminatedSoldiers.add(eliminated);

            //Display the current step, the next soldier to be eliminated (current index + 1), the eliminated soldier and the remaining soldiers
            System.out.println("Step " + step + ":");
            System.out.println("  Next soldier to be eliminated: " + nextForElimination + ", at position " + (currentIndex + 1));
            System.out.println("  Eliminated soldier: " + eliminated);
            System.out.println("  Remaining soldiers: " + soldierNames);
            System.out.println();

            //After eliminating a soldier, the currentIndex points to the next soldier (given that the element at currentIndex was removed, so all the remaining elements shifted to the left)
            //Set condition for the case when the last element in the list is eliminated and to prevent attempting to access an empty list
            if (currentIndex >= soldierNames.size() && soldierNames.size() > 0) {
                //The current index is 're-set' to 0
                currentIndex = 0;
            }
            //Increment the elimination step count after each iteration
            step++;
        }
        //Declare variable of type int (surviving soldier) and set its value as the value at index 0
        String survivor = soldierNames.get(0);
        //Display separator
        System.out.println("<=============>");
        //Display the eliminated soldiers (in the order of elimination)
        System.out.println("Eliminated soldiers: " + eliminatedSoldiers);
        //Display the surviving soldier
        System.out.println("Last soldier standing: " + survivor);
    }
}