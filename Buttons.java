import java.util.Scanner;

public class Buttons {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            if (a < b)
                System.out.println("Second");
            else if (a > b)
                System.out.println("First");
            else
                System.out.println(c % 2 == 1 ? "First" : "Second");
        }

        sc.close();

    }
}