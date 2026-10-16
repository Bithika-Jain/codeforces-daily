
import java.io.*;
import java.util.*;

public class OddOneOut {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a != b && a != c) {
                System.out.println(a);
            } else if (b != a && b != c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}
