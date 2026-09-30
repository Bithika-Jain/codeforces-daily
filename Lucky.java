import java.io.*;

public class Lucky {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String ticket = br.readLine();

            int firstSum = 0;
            int lastSum = 0;

            for (int i = 0; i < 3; i++) {
                firstSum += ticket.charAt(i) - '0';
                lastSum += ticket.charAt(i + 3) - '0';
            }

            if (firstSum == lastSum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}