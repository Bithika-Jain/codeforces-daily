import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next().toLowerCase();
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if ("aoyeui".indexOf(ch) == -1) {
                result.append(".").append(ch);
            }
        }

        System.out.println(result);

        sc.close();
    }
}