import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt - number of family members
        System.out.print("Enter number of family members: ");
        //Declare variable of type int and read the number of categories as an integer (also remove any whitespace)
        int n = Integer.parseInt(sc.nextLine().trim());
        //Declare array of type String (for family members) and set the number of elements to n
        String[] familyMembers = new String[n];
        //Declare array of type String (for activities) and set the number of elements to n
        String[] activities = new String[n];
        //Loop from i = 0 to n, incrementing i by 1 -> to read each member's name and preferred activity
        for (int i = 0; i < n; i++) {
            //Display prompt - enter family member name
            System.out.print("Enter name for family member " + (i + 1) + ": ");
            //Read the value from the keyboard
            familyMembers[i] = sc.nextLine().trim();
            //Display prompt - enter activity for each family member
            System.out.print("Enter activity for " + familyMembers[i] + ": ");
            //Read the value from the keyboard
            activities[i] = sc.nextLine().trim();
        }
        //Declare variable of type String and assign to it the value retrieved by the called function
        String chart = organizeWinterActivities(familyMembers, activities);
        //Display section title
        System.out.println("\n--- Winter Activities ---");
        //Display the result
        System.out.println(chart);
    }

    //Define method for organizing the activities
    public static String organizeWinterActivities(String[] familyMembers, String[] activities) {
        //Declare map of type LinkedHashMap to preserve the insertion order
        Map<String, List<String>> activityMap = new LinkedHashMap<>();
        //Loop from i = 0 to the length of array familyMembers, incrementing i by 1 -> to group each family member under their preferred activity
        for (int i = 0; i < familyMembers.length; i++) {
            //Declare variable of type String and assign to it the element at position i in the activities array
            String activity = activities[i];
            //Declare variable of type String and assign to it the element at position i in the familyMembers array
            String member = familyMembers[i];
            //If this activity hasn't been seen yet, create a new list for it
            activityMap.putIfAbsent(activity, new ArrayList<>());
            //Add the member to their activity group
            activityMap.get(activity).add(member);
        }
        //Sort activities by number of participants (most first)
        //Convert entry set to a list so it can be sorted
        List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(activityMap.entrySet());
        //Compare each pair of entries by participant count; b - a gives descending order (largest group first)
        sortedEntries.sort((a, b) -> b.getValue().size() - a.getValue().size());
        //Build the final output string using StringBuilder
        StringBuilder result = new StringBuilder();
        //Loop through each entry from the sortedEntries list
        for (Map.Entry<String, List<String>> entry : sortedEntries) {
            //Declare variable of type String and assign to it the activity name (the key of the map entry)
            String activity = entry.getKey();
            //Declare variable of type String and assign to it the list of members assigned to this activity (the value of the map entry)
            List<String> members = entry.getValue();
            //Reverse the order of members within this activity group
            Collections.reverse(members);
            //Declare variable of type int (counter) and assign to it the value of the size on the members list (i.e. how many members there are in the group)
            int guestCount = members.size();
            //Format the line: "Activity: [Member1, Member2] (X guests)"
            result.append(activity)
                    .append(": [")
                    .append(String.join(", ", members))
                    .append("] (")
                    .append(guestCount)
                    .append(" guest")
                    .append(guestCount == 1 ? "" : "s") //For handling the singular/plural
                    .append(")\n");
        }
        //Return the result as a string
        return result.toString();
    }
}