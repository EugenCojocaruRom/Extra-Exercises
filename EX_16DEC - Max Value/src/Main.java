import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value x for the first number
        System.out.print("x = ");
        //Declare variable x of type int and read it from the keyboard
        int x = sc.nextInt();
        //Display value y for the second number
        System.out.print("y = ");
        //Declare variable y of type int and read it from the keyboard
        int y = sc.nextInt();

        maxValue(x, y);
    }

    public static void maxValue(int x, int y) {
        String maxVal = (x >= y) ? "Max value: " + x : "Max value: " + y;
        System.out.println(maxVal);
    }
}