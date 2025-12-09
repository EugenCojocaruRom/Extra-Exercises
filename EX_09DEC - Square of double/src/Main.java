import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        double x = sc.nextDouble();

        System.out.print(x + " squared is " + squareDouble(x));
    }

    static double squareDouble(double x) {
        return Math.pow(x, 2.0);
    }
}