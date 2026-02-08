import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt for the user
        System.out.println("Enter the text: ");
        //Declare variable of type String and read it from the keyboard
        String text = sc.nextLine();
        //Display prompt for the user
        System.out.print("Enter the symbol: ");
        String symbol = sc.nextLine();

        //Method for replacing the spaces with the symbol
        System.out.println(modifyText(text, symbol));
        //Easier method: replace()
//        System.out.println("The modified text is: " + text.replace(" ", symbol));
    }

    //Define method for finding the spaces in the text and replacing them with the symbol
    static String modifyText(String text, String symbol) {
        //Declare variable of type StringBuilder to store the modified text
        StringBuilder modifiedText = new StringBuilder();
        //Loop through the text from i = 0 to the length of the text, incrementing i by 1
        for  (int i = 0; i < text.length(); i++) {
            //Declare variable of type char for identifying the current character in the iteration
            char currentChar = text.charAt(i);
            //Check that the current character is a space
            if (currentChar == ' ') {
                //Add the symbol to the text instead of the space
                modifiedText.append(symbol);
            }
            else {
                //Leave the current character in place if it is not a space
                modifiedText.append(currentChar);
            }
        }
        //Return the modified text
        return "The modified text is: " + modifiedText;
    }
}