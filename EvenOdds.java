import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        long oddCount = (n + 1) / 2;

        if (k <= oddCount) {
            // k-th odd number
            System.out.println(2 * k - 1);
        } else {
            // k-th number is in the even part
            long evenPosition = k - oddCount;
            System.out.println(2 * evenPosition);
        }

        sc.close();
    }
}