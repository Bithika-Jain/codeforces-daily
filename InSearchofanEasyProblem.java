import java.util.Scanner;

public class InSearchofanEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean hard = false;

        for (int i = 0; i < n; i++) {
            int response = sc.nextInt();

            if (response == 1) {
                hard = true;
            }
        }

        if (hard) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }

        sc.close();
    }
}
