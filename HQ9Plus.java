import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HQ9Plus {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String p = br.readLine();

        for (char ch : p.toCharArray()) {
            if (ch == 'H' || ch == 'Q' || ch == '9') {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
