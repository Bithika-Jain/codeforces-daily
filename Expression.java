import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Expression {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int ans = Math.max(
            Math.max(a + b + c, a * b * c),
            Math.max(a + b * c, (a + b) * c)
        );

        ans = Math.max(ans, a * (b + c));

        System.out.println(ans);
    }
}