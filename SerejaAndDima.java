import java.io.*;
import java.util.*;

public class SerejaAndDima {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] cards = new int[n];

        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = n - 1;

        int sereja = 0;
        int dima = 0;

        boolean serejaTurn = true;

        while (left <= right) {
            int chosen;

            if (cards[left] > cards[right]) {
                chosen = cards[left];
                left++;
            } else {
                chosen = cards[right];
                right--;
            }

            if (serejaTurn) {
                sereja += chosen;
            } else {
                dima += chosen;
            }

            serejaTurn = !serejaTurn;
        }

        System.out.println(sereja + " " + dima);
    }
}