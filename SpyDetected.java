
import java.io.*;
import java.util.*;

public class SpyDetected {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int differentIndex;

            if (arr[0] != arr[1] && arr[0] != arr[2]) {
                differentIndex = 1;
            } else if (arr[1] != arr[0] && arr[1] != arr[2]) {
                differentIndex = 2;
            } else {
                differentIndex = 3;

                for (int i = 3; i < n; i++) {
                    if (arr[i] != arr[0]) {
                        differentIndex = i + 1;
                        break;
                    }
                }
            }

            System.out.println(differentIndex);
        }
    }
}
