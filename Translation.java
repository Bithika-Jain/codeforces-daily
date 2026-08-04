import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String tra = sc.next();

        String rev = new StringBuilder(str).reverse().toString();

        System.out.println((tra.equals(rev)) ? "YES" : "NO");

        sc.close();

    }
}
