
import java.io.*;
import java.util.*;

public class XeniaAndRingroad {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int currentHouse = 1;
        long time = 0;

        for (int i = 0; i < m; i++) {
            int targetHouse = Integer.parseInt(st.nextToken());

            if (targetHouse >= currentHouse) {
                time += targetHouse - currentHouse;
            } else {
                time += n - currentHouse + targetHouse;
            }

            currentHouse = targetHouse;
        }

        System.out.println(time);
    }
}
