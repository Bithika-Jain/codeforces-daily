import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String guest = sc.nextLine();
        String host = sc.nextLine();
        String pile = sc.nextLine();

        int[] count = new int[26];

        for (char ch : guest.toCharArray()) {
            count[ch - 'A']++;
        }

        for (char ch : host.toCharArray()) {
            count[ch - 'A']++;
        }

        for (char ch : pile.toCharArray()) {
            count[ch - 'A']--;
        }

        boolean valid = true;

        for (int value : count) {
            if (value != 0) {
                valid = false;
                break;
            }
        }

        if (valid) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}