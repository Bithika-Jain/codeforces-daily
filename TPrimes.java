import java.io.*;
import java.util.*;

public class TPrimes {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder output = new StringBuilder();

        while (n-- > 0) {
            long x = Long.parseLong(st.nextToken());

            if (isTPrime(x)) {
                output.append("YES\n");
            } else {
                output.append("NO\n");
            }
        }

        System.out.print(output);
    }

    static boolean isTPrime(long x) {
        // 1 is not T-prime
        if (x < 4) {
            return false;
        }

        long root = (long) Math.sqrt(x);

        // Fix possible floating-point rounding
        while ((root + 1) * (root + 1) <= x) {
            root++;
        }

        while (root * root > x) {
            root--;
        }

        // x must be a perfect square
        if (root * root != x) {
            return false;
        }

        // root must be prime
        return isPrime(root);
    }

    static boolean isPrime(long x) {
        if (x < 2) {
            return false;
        }

        if (x % 2 == 0) {
            return x == 2;
        }

        for (long i = 3; i * i <= x; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }
}