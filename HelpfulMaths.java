import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] numbers = s.split("\\+");

        Arrays.sort(numbers);

        System.out.print(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            System.out.print("+" + numbers[i]);
        }

        sc.close();
    }
}