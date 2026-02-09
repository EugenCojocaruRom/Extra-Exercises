import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt for user - enter number of rows
        System.out.print("Enter number of rows: ");
        //Declare variable of type int and read it from keyboard
        int n = sc.nextInt();
        sc.nextLine();
        //Display prompt for user - enter sentence
        System.out.println("Enter sentences:");
        //Set condition for reading each sentence from the keyboard
        List<Map<String, Integer>> result = new ArrayList<>();
        while (n != 0) {
            int index = 0;
            //Declare variable of type String and read it from the keyboard
            String[] words = sc.nextLine().split(" ");
            Map<String, Integer> seen = new HashMap<>();
            for (String word : words) {
                String lowerCaseWord = word.toLowerCase();
                if (!seen.containsKey(lowerCaseWord)) {
                    seen.put(lowerCaseWord, index++);
                }
            }
            n--;
            result.add(seen);
        }
        System.out.println(result);
    }


}