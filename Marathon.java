import java.io.*;
import java.util.*;

public class Marathon {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int timur = Integer.parseInt(st.nextToken());
            int count = 0;

            for (int i = 0; i < 3; i++) {
                int distance = Integer.parseInt(st.nextToken());

                if (distance > timur) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}