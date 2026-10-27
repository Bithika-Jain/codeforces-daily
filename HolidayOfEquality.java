
import java.io.*;
import java.util.*;

public class HolidayOfEquality {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = 0;

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, a[i]);
        }

        int total = 0;

        for (int i = 0; i < n; i++) {
            total += max - a[i];
        }

        System.out.println(total);
    }
}
