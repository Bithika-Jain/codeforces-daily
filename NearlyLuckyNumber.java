import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '4' || c == '7') count++;
        }

        System.out.println((count == 4 || count == 7)? "YES" : "NO");

        sc.close();

    }
}
