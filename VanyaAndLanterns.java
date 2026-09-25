import java.io.*;
import java.util.*;

public class VanyaAndLanterns {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[] lanterns = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            lanterns[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(lanterns);

        double maxGap = 0;

        // Maximum gap between two consecutive lanterns
        for (int i = 1; i < n; i++) {
            maxGap = Math.max(maxGap, lanterns[i] - lanterns[i - 1]);
        }

        // Distance needed to cover the two ends
        double leftEnd = lanterns[0];
        double rightEnd = l - lanterns[n - 1];

        double answer = Math.max(maxGap / 2.0, Math.max(leftEnd, rightEnd));

        System.out.printf("%.10f%n", answer);
    }
}