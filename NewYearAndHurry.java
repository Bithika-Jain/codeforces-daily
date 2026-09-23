import java.io.*;
import java.util.*;

public class NewYearAndHurry {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int availableTime = 240 - k;
        int timeUsed = 0;
        int solved = 0;

        for (int i = 1; i <= n; i++) {
            timeUsed += 5 * i;

            if (timeUsed <= availableTime) {
                solved++;
            } else {
                break;
            }
        }

        System.out.println(solved);
    }
}