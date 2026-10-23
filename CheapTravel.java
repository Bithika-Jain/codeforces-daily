
import java.io.*;
import java.util.*;

public class CheapTravel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cost = Math.min(n * a, (n / m) * b + Math.min((n % m) * a, b));

        System.out.println(cost);
    }
}
