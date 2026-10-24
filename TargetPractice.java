
import java.io.*;

public class TargetPractice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int score = 0;

            for (int i = 0; i < 10; i++) {
                String row = br.readLine();

                for (int j = 0; j < 10; j++) {
                    if (row.charAt(j) == 'X') {
                        score += Math.min(Math.min(i, j), Math.min(9 - i, 9 - j)) + 1;
                    }
                }
            }

            System.out.println(score);
        }
    }
}
