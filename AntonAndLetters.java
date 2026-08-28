import java.util.Scanner;

public class AntonAndLetters {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.length() <= 2) {
            System.out.println(0);
            sc.close();
            return;
        }

        int[] arr = new int[26];
       
        for (int i = 1; i < s.length(); i+=3)
            arr[s.charAt(i)-'a']++;

        int res = 0;
        for (int n : arr) 
            if (n > 0) res++;

        System.out.println(res);
        sc.close();

    }
}