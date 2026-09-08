import java.util.Scanner;

public class IQTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int evenCount = 0;
        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenCount++;
                evenIndex = i;
            } else {
                oddIndex = i;
            }
        }

        if (evenCount == 1) {
            System.out.println(evenIndex);
        } else {
            System.out.println(oddIndex);
        }

        sc.close();
    }
}