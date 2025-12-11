import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display label for string
        System.out.print("The Roman number is: ");
        //Declare variable 'Str' of type String and read it from the keyboard
        String str = sc.nextLine();

        int conv = convertRomToInt(str);
        System.out.print("\nThe value of the Roman numeral is: " + conv);
    }

    //Define method for returning the values of the Roman numerals as numeric values
    static int romanValue(char rom) {
        //Set the values to be returned depending on the value of 'rom' (rom is the Roman numeral)
        if (rom == 'I')
            return 1;
        if (rom == 'V')
            return 5;
        if (rom == 'X')
            return 10;
        if (rom == 'L')
            return 50;
        if (rom == 'C')
            return 100;
        if (rom == 'D')
            return 500;
        if (rom == 'M')
            return 1000;
        //If none of the values above have been entered, the system returns 0
        return 0;
    }

    //Method for calculating the values of the Roman numerals
    static int convertRomToInt(String str) {
        //Declare variable 'conv' of type int (for the converted value) and initialize it
        int conv = 0;
        //Loop through String 'str' from i = 0  to the length of str, incrementing i by 1
        for (int i = 0; i < str.length(); ++i) {
            /*Declare variable 'ch1' (for the value of the current character)
            and initialize it as the value found at the position of the first index*/
            int ch1 = romanValue(str.charAt(i));
            //Compare 'ch1' to the next character if it exists
            if (i + 1 < str.length()) {
                /*Declare variable 'ch2' (for the value of the next character)
                and initialize it as the value found at the position of the next index*/
                int ch2 = romanValue(str.charAt(i + 1));
                /*If the value of 'ch1' is bigger than or equal to the value of 'ch2', it is added to the 'conv' value*/
                if (ch1 >= ch2) {
                    conv += ch1;
                /*If the value of 'ch1' is bigger than or equal to the value of 'ch2',
                'ch2' is subtracted first from 'ch1' and the result is added to the 'conv' value*/
                } else {
                    conv = conv + (ch2 - ch1);
                    //The value of i is incremented
                    i++;
                }
            //The value of 'ch1' is added to the 'conv' value if none of the conditions above are met
            } else {
                conv += ch1;
            }
        }
        return conv;
    }
}