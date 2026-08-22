import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next().toLowerCase();

        boolean[] present = new boolean[26];

        for (char ch : s.toCharArray()) {
            present[ch - 'a'] = true;
        }

        for (boolean letter : present) {
            if (!letter) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");

        sc.close();
    }
}
