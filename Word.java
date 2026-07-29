

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        int upper = 0;
        int lower = 0;

        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upper++;
            } else {
                lower++;
            }
        }

        if (upper > lower) {
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }

        sc.close();
    }
}