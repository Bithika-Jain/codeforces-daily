import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a;
        int b;
        int cap = 0;
        int minCap = 0;

        while (n-- > 0) {
            a = sc.nextInt();
            b = sc.nextInt();

            cap = cap - a + b;

            minCap = Math.max(minCap, cap);
        }

        System.out.println(minCap);

        sc.close();

    }
}
