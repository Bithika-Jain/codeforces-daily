
import java.io.*;

public class MultiplyBy2DivideBy6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int twos = 0;
            int threes = 0;

            while (n % 2 == 0) {
                twos++;
                n /= 2;
            }

            while (n % 3 == 0) {
                threes++;
                n /= 3;
            }

            if (n != 1 || twos > threes) {
                System.out.println(-1);
            } else {
                System.out.println(threes + (threes - twos));
            }
        }
    }
}
