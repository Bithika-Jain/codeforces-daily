
import java.io.*;

public class CoverInWater {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            if (s.contains("...")) {
                System.out.println(2);
            } else {
                int count = 0;

                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '.') {
                        count++;
                    }
                }

                System.out.println(count);
            }
        }
    }
}
