import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TPrimes {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int police = 0;
        int untreated = 0;

        for (int i = 0; i < n; i++) {
            int event = Integer.parseInt(st.nextToken());

            if (event == -1) {
                if (police > 0) {
                    police--;
                } else {
                    untreated++;
                }
            } else {
                police += event;
            }
        }

        System.out.println(untreated);
    }
}