import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc=new Scanner(System.in);
        //Display visual delimiter
        System.out.println("================================");
        //Loop through the interval 0 to 3 from i = 0 to 3, incrementing i by 1
        for(int i=0;i<3;i++){
            //Declare variable of type string and read it from the keyboard
            String s1=sc.next();
            //Declare variable of type int and read it from the keyboard
            int x=sc.nextInt();
            /*Display a formatted version of the input as follows:
            - col. 1 (string) left justified using exactly characters
            - col. 2 (int) - if less than three digits, the output's leading digits must be padded with zeroes.*/
            System.out.printf("%-15s%03d%n", s1, x);
        }
        //Display visual delimiter
        System.out.println("================================");
    }
}