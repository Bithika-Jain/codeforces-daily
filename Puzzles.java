import java.io.*;
import java.util.*;

public class Puzzles {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] puzzles = new int[m];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            puzzles[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(puzzles);

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i <= m - n; i++) {
            int difference = puzzles[i + n - 1] - puzzles[i];
            answer = Math.min(answer, difference);
        }

        System.out.println(answer);
    }
}