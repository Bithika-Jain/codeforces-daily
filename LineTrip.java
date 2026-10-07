import java.io.*;
import java.util.*;

public class LineTrip {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            int[] stations = new int[n];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                stations[i] = Integer.parseInt(st.nextToken());
            }

            int maxDistance = stations[0];

            for (int i = 1; i < n; i++) {
                maxDistance = Math.max(maxDistance, stations[i] - stations[i - 1]);
            }

            // From the last station to x, we have to travel there and back
            maxDistance = Math.max(maxDistance, 2 * (x - stations[n - 1]));

            System.out.println(maxDistance);
        }
    }
}