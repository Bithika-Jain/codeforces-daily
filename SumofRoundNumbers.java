import java.io.*;
import java.util.*;

public class SumofRoundNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            ArrayList<Integer> roundNumbers = new ArrayList<>();
            int place = 1;

            while (n > 0) {
                int digit = n % 10;

                if (digit != 0) {
                    roundNumbers.add(digit * place);
                }

                n /= 10;
                place *= 10;
            }

            System.out.println(roundNumbers.size());

            for (int num : roundNumbers) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}