import java.util.Scanner;

public class neonnumber {
    public static void main(String[] args) {
        Scanner mb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = mb.nextInt();

        int sq = n * n;
        int sum = 0;
        while (sq > 0) {
            int digit = sq % 10;
            sum += digit;
            sq /= 10;
        }

        if (sum == n) {
            System.out.println("The number is a Neon Number");
        } else {
            System.out.println("The number is not a Neon Number");
        }
    }
}