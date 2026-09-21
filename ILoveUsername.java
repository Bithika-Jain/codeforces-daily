import java.io.*;
import java.util.*;

public class ILoveUsername {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());

        int best = first;
        int worst = first;
        int amazing = 0;

        for (int i = 1; i < n; i++) {
            int score = Integer.parseInt(st.nextToken());

            if (score > best) {
                amazing++;
                best = score;
            } else if (score < worst) {
                amazing++;
                worst = score;
            }
        }

        System.out.println(amazing);
    }
}