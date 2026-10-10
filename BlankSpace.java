import java.util.Scanner;

public class BlankSpace {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int len = 0;
            int maxLen = 0;

            while (n-- > 0) {
                if (sc.nextInt() == 0) {
                    len++;
                    maxLen = Math.max(maxLen, len);
                }
                else
                    len = 0;
            }

            System.out.println(maxLen);
        }

        sc.close();
    }
}