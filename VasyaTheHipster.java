
import java.io.*;
import java.util.*;

public class VasyaTheHipster {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int different = Math.min(a, b);
        int same = Math.abs(a - b) / 2;

        System.out.println(different + " " + same);
    }
}