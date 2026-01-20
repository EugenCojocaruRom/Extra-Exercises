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

        //Call method for displaying the words as a list, separated by space and comma
        System.out.println("The words in the text are: " + words(text));
        //Call method for counting the words
        System.out.println("There are " + wordCount(text) + " words in this text.");
        //Call method for sorting the words alphabetically
        System.out.println("The sorted words are: " + sortedWords(text));
        //Call method for displaying only the distinct words (no duplicates) in the text, in their initial order
        System.out.println("The distinct words, as they appear in the initial text, are: " + distinctWords(text));
    }

    //Define method for displaying the array words as a list
    static List<String> words(String text) {
        //Declare an array of type String and splits it taking into account any whitespaces (\\s)
        String[] words = text.split("\\s");
        //Return the result as an ArrayList, where the array was converted into a list
        return new ArrayList<>(Arrays.asList(words));
    }

    //Define method for counting the words in the list
    static int wordCount(String text) {
        //Call the 'words' method to retrieve the list of words and then apply 'size' to get the number of elements in the list
        return words(text).size();
    }

    //Define method for sorting alphabetically the words in the text
    static Collection<String> sortedWords(String text) {
        //1. Using List<String>
        //Declare List of type String and call the 'words' method to retrieve the text words
//        List<String> wordsList = words(text);
//        //Call the 'sort' method for sorting the words
//        Collections.sort(wordsList, String.CASE_INSENSITIVE_ORDER);
//        //Return the sorted words - including duplicates
//        return wordsList;

        //2. Using Set<String>
        //Declare Set of type String and set it as a TreeSet, ignoring uppercase and lowercase
        Set<String> wordSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        //Add all the words of the text to the set by calling the 'words' method
        wordSet.addAll(words(text));
        //Return the sorted words after calling the 'words' method - no duplicates
        return wordSet;
    }

    //Define method to get only the distinct words (no duplicates) contained in the text, in their initial order
    static Collection<String> distinctWords(String text) {
        //Return the distinct words (no duplicates), in their initial order
        return new LinkedHashSet<>(words(text));
    }
}