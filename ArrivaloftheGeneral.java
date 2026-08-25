import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrivaloftheGeneral {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int max = a[0];
        int min = a[0];

        for (int i = 1; i < n; i++) {
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }

        // Leftmost maximum
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == max) {
                maxIndex = i;
                break;
            }
        }

        // Rightmost minimum
        int minIndex = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] == min) {
                minIndex = i;
                break;
            }
        }

        int answer = maxIndex + (n - 1 - minIndex);

        // If maximum is originally after minimum,
        // moving maximum to the front shifts minimum one position right.
        if (maxIndex > minIndex) {
            answer--;
        }

        System.out.println(answer);
    }
}