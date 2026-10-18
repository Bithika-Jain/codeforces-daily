
import java.io.*;

public class RaisingBacteria {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int count = 0;

        while (x > 0) {
            count += x % 2;
            x /= 2;
        }

        System.out.println(count);
    }
}
