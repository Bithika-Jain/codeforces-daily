import java.util.Scanner;

public class CreatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();

            System.out.println(b.charAt(0) + a.substring(1, a.length()) + " " + a.charAt(0) + b.substring(1, b.length()));
        }

        sc.close();
    }
}