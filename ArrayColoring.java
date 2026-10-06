import java.io.*;
import java.util.*;

public class ArrayColoring {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            int oddCount = 0;

            for (int i = 0; i < n; i++) {
                int value = Integer.parseInt(st.nextToken());

                if (value % 2 != 0) {
                    oddCount++;
                }
            }

            if (oddCount % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}