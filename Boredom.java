
import java.io.*;
import java.util.*;

public class Boredom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] count = new int[100001];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            count[x]++;
        }

        long[] dp = new long[100001];

        dp[1] = count[1];

        for (int i = 2; i <= 100000; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + (long) i * count[i]);
        }

        System.out.println(dp[100000]);
    }
}
