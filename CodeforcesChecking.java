
import java.io.*;

public class CodeforcesChecking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String codeforces = "codeforces";

        while (t-- > 0) {
            char ch = br.readLine().charAt(0);

            if (codeforces.indexOf(ch) != -1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
