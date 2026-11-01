import java.util.Scanner;

public class DislikeOfThrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();

            int count = 0;
            int n = 1;

            while (count < a) {
                if (n % 3 != 0 && n % 10 != 3) {
                    count++;
                }

                n++;
            }

            System.out.println(n - 1);
        }

        sc.close();
    }
}