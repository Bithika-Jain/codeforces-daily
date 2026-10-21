
import java.io.*;
import java.util.*;

public class Books {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int[] books = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            books[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int sum = 0;
        int maxBooks = 0;

        for (int right = 0; right < n; right++) {
            sum += books[right];

            while (sum > t) {
                sum -= books[left];
                left++;
            }

            maxBooks = Math.max(maxBooks, right - left + 1);
        }

        System.out.println(maxBooks);
    }
}
