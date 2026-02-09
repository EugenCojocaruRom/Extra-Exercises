import java.util.*;
import java.util.stream.Collectors;

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
        List<Map<Integer, String>> result = new ArrayList<>();
        while (n != 0) {
            int index = 0;
            //Declare variable of type String and read it from the keyboard
            String[] words = sc.nextLine().split(" ");
            Map<String, Integer> seen = new TreeMap<>();
            for (String word : words) {
                String lowerCaseWord = word.toLowerCase();
                if (!seen.containsKey(lowerCaseWord)) {
                    seen.put(lowerCaseWord, index++);
                }
            }
            n--;
            //Sort map by value, in ascending order
//            Map<String, Integer> sorted_seen = seen.entrySet().stream()
//                    .sorted(Map.Entry.comparingByValue())
//                            .map(Map.Entry::getKey)
//                                    .collect(Collectors.toList());

            Map<Integer, String> sorted_seen = new TreeMap<>();
            for (Map.Entry<String, Integer> entry : seen.entrySet()) {
                sorted_seen.put(entry.getValue(), entry.getKey());
            }

            result.add(sorted_seen);
        }
        for (Map<Integer, String> row : result) {
            //Sort map by value, in ascending order
            //Collections.sort(Map.Entry.comparingByValue(row, (a, b) -> a.));
            for (Map.Entry<Integer, String> entry : row.entrySet()) {

                System.out.print(entry.getValue()+" ");
            }
            System.out.println();
        }
//        System.out.println(result);
    }


}