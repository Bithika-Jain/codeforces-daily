import java.util.Scanner;

public class ShortSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String a = sc.next();

            if (a.equals("abc") || a.equals("acb") || 
                a.equals("bac") || a.equals("cba"))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}