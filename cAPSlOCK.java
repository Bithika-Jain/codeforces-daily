import java.util.Scanner;

public class cAPSlOCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        boolean change = true;

        // Check from the second character
        for (int i = 1; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                change = false;
                break;
            }
        }

        // If all except first are uppercase
        if (change) {
            s = s.toLowerCase();

            // Make the first character uppercase
            s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        }

        System.out.println(s);

        sc.close();
    }
}