package functionalinterfaces;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter:");
        int n = Integer.parseInt(sc.next());
        int factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial = factorial * i;
            i++;
        }
        System.out.println(factorial);

    }
}
