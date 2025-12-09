import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        int sum = sumOfTwo(a, b);
        System.out.print("The sum of a and b is " + sum);
    }

    static int sumOfTwo(int a, int b) {
        return a + b;
    }
}