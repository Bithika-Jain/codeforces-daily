import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt()-1;
        
        char last = sc.next().charAt(1);
        int res = 1;

        while (n-- > 0) {

            String s = sc.next();

            if (last == s.charAt(0)) res++;

            last = s.charAt(1);

        }

        System.out.println(res);

        sc.close();

    }
}