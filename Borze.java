import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); ) {
            if (s.charAt(i) == '.') {
                ans.append('0');
                i++;
            } else {
                if (s.charAt(i + 1) == '.') {
                    ans.append('1');
                } else {
                    ans.append('2');
                }
                i += 2;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}