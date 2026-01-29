import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display message for user
        System.out.println("Enter words: ");
        //Declare variable of type string and read it from the keyboard
        String text = sc.nextLine();
        //Display separator
        System.out.println("==================");

        //Test text: Once upon a time in a land far far away there lived a great king whose name was a great mystery

        //Call method for displaying the words as a list, separated by space and comma
        System.out.println("The words in the text are: " + words(text));
        //Call method for displaying the distinct words in the text, sorted alphabetically
        System.out.println("The distinct words, sorted alphabetically, are: " + distinctSortedWords(text));
        //Call method for counting how many times each word appears in the text
        System.out.println("Number of occurrences of each word: " + wordsUsageCount(text));
        //Call method for counting how many times each word appears in the text, but sorted alphabetically
        System.out.println("Number of occurrences of each word (sorted alphabetically): " + wordsUsageCountSortedByWord(text));
    }

    //Define method for displaying the array words as a list
    static List<String> words(String text) {
        //Declare an array of type String and splits it taking into account any whitespaces (\\s)
        String[] words = text.split("\\s");
        //Return the result as an ArrayList, where the array was converted into a list
        return new ArrayList<>(Arrays.asList(words));
    }

    //Define method for displaying the distinct words in the text, sorted alphabetically
    static Collection<String> distinctSortedWords(String text) {
        //Declare Set of type String and set it as a TreeSet, ignoring uppercase and lowercase
        Set<String> newSortedWords = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        //Add all the words of the text to the set by calling the 'words' method
        newSortedWords.addAll(words(text));
        //Return the sorted words after calling the 'words' method - no duplicates
        return newSortedWords;
    }

    //Define method for counting how many times each word appears in the text
    static Map<String, Integer> wordsUsageCount(String text) {
        //Declare variable of type Map with key of type String and value of type int, and set it as a HashMap
        Map<String, Integer> counter = new HashMap<>();
        //Loop through each word from the text, calling the 'words' method
        for (String word : words(text)) {
            //Have each word converted to lowercase
            word = word.toLowerCase();
            //Check if the word is already in the 'counter' Map
            if (counter.containsKey(word)) {
                //If the word already exists (was found before), increment the count
                counter.put(word, counter.get(word) + 1);
            }
            //If the word does not exist yet (first occurrence)
            else {
                //The word is added to the 'counter' Map with a value of 1
                counter.put(word, 1);
            }
        }
        return counter;
    }

    //Define method for counting how many times each word appears in the text and ordering the words alphabetically
    static Map<String, Integer> wordsUsageCountSortedByWord(String text) {
        //Declare variable of type Map with key of type String and value of type int, and set it as a TreeMap
        Map<String, Integer> counter = new TreeMap<>();
        //Loop through each word from the text, calling the 'words' method
        for (String word : words(text)) {
            //Have each word converted to lowercase
            word = word.toLowerCase();
            //Check if the word is already in the 'counter' Map
            if (counter.containsKey(word)) {
                //If the word already exists (was found before), increment the count
                counter.put(word, counter.get(word) + 1);
            }
            //If the word does not exist yet (first occurrence)
            else {
                //The word is added to the 'counter' Map with a value of 1
                counter.put(word, 1);
            }
        }
        //Return the value of 'counter'
        return counter;
    }
}