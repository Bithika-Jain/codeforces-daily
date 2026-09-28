import java.io.*;
import java.util.*;

public class HalloumiBoxes {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] boxes = new int[n];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                boxes[i] = Integer.parseInt(st.nextToken());
            }

            if (k > 1) {
                System.out.println("YES");
            } else {
                boolean sorted = true;

                for (int i = 1; i < n; i++) {
                    if (boxes[i] < boxes[i - 1]) {
                        sorted = false;
                        break;
                    }
                }

                System.out.println(sorted ? "YES" : "NO");
            }
        }
    }
}