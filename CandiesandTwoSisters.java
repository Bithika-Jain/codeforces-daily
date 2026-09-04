import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CandiesandTwoSisters {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            long n = Long.parseLong(br.readLine());

            if (n < 3) {
                System.out.println(0);
            } else {
                System.out.println((n - 1) / 2);
            }
        }
    }
}