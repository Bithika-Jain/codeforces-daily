
import java.io.*;
import java.util.*;

public class GameWithSticks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (Math.min(n, m) % 2 == 1) {
            System.out.println("Akshat");
        } else {
            System.out.println("Malvika");
        }
    }
}
