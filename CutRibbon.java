
import java.io.*;
import java.util.*;

public class CutRibbon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            if (i >= a && dp[i - a] != -1) {
                dp[i] = Math.max(dp[i], dp[i - a] + 1);
            }

            if (i >= b && dp[i - b] != -1) {
                dp[i] = Math.max(dp[i], dp[i - b] + 1);
            }

            if (i >= c && dp[i - c] != -1) {
                dp[i] = Math.max(dp[i], dp[i - c] + 1);
            }
        }

        System.out.println(dp[n]);
    }
}
