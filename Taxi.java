import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Taxi {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] count = new int[5];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int size = Integer.parseInt(st.nextToken());
            count[size]++;
        }

        int taxis = count[4];

        // Groups of 3 can only be paired with groups of 1
        int pair31 = Math.min(count[3], count[1]);
        taxis += count[3];
        count[1] -= pair31;

        // Two groups of 2 fit exactly in one taxi
        taxis += count[2] / 2;

        // One group of 2 can be paired with up to two groups of 1
        if (count[2] % 2 == 1) {
            taxis++;
            count[1] = Math.max(0, count[1] - 2);
        }

        // Remaining groups of 1: four per taxi
        taxis += (count[1] + 3) / 4;

        System.out.println(taxis);
    }
}