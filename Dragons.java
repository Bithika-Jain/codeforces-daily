import java.util.*;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();

        int[][] dragons = new int[n][2];

        for (int i = 0; i < n; i++) {
            dragons[i][0] = sc.nextInt(); // dragon strength
            dragons[i][1] = sc.nextInt(); // bonus
        }

        // Fight weaker dragons first
        Arrays.sort(dragons, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < n; i++) {
            if (s <= dragons[i][0]) {
                System.out.println("NO");
                sc.close();
                return;
            }

            s += dragons[i][1];
        }

        System.out.println("YES");

        sc.close();
    }
}