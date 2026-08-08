import java.util.Scanner;

public class QueueattheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        char[] queue = sc.next().toCharArray();

        for (int time = 0; time < t; time++) {
            for (int i = 0; i < n - 1; i++) {
                if (queue[i] == 'B' && queue[i + 1] == 'G') {
                    queue[i] = 'G';
                    queue[i + 1] = 'B';

                    // Skip the next position so this boy
                    // does not move again in the same second.
                    i++;
                }
            }
        }

        System.out.println(new String(queue));

        sc.close();
    }
}
