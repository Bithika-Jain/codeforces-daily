import java.io.*;

public class OddDivisor {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            long n = Long.parseLong(br.readLine());

            while (n % 2 == 0) {
                n /= 2;
            }

            if (n > 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}