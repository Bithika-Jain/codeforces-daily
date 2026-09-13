import java.util.Scanner;

public class cAPSlOCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        boolean change = true;

        // Check if all characters except the first are uppercase
        for (int i = 1; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                change = false;
                break;
            }
        }

        if (change) {
            StringBuilder result = new StringBuilder();

            for (char ch : s.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    result.append(Character.toLowerCase(ch));
                } else {
                    result.append(Character.toUpperCase(ch));
                }
            }

            s = result.toString();
        }

        System.out.println(s);

        sc.close();
    }
}