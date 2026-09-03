import java.io.*;
import java.util.*;

public class KefaandFirstSteps {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int previous = Integer.parseInt(st.nextToken());
        int currentLength = 1;
        int maxLength = 1;

        for (int i = 1; i < n; i++) {
            int current = Integer.parseInt(st.nextToken());

            if (current >= previous) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            maxLength = Math.max(maxLength, currentLength);
            previous = current;
        }

        System.out.println(maxLength);
    }
}