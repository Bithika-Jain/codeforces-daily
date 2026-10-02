import java.io.*;
import java.util.*;

public class RestoringThreeNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[4];

        for (int i = 0; i < 4; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        int x = a[3] - a[2];
        int y = a[3] - a[1];
        int z = a[3] - a[0];

        System.out.println(x + " " + y + " " + z);
    }
}