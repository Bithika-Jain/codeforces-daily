import java.io.*;
import java.util.*;

public class InterestingDrink {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] prices = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(prices);

        int q = Integer.parseInt(br.readLine());

        while (q-- > 0) {
            int money = Integer.parseInt(br.readLine());

            int left = 0;
            int right = n - 1;
            int answer = 0;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (prices[mid] <= money) {
                    answer = mid + 1;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            System.out.println(answer);
        }
    }
}