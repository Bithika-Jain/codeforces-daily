import java.io.*;

public class ABAgain {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int tens = n / 10;
            int ones = n % 10;

            System.out.println(tens + ones);
        }
    }
}