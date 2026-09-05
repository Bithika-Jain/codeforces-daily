import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Dubstep {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String result = s.replace("WUB", " ").trim();

        // Remove multiple spaces between words
        result = result.replaceAll("\\s+", " ");

        System.out.println(result);
    }
}