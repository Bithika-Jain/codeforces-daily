import java.util.Scanner;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] arr = new boolean[n];

        int p = sc.nextInt();

        for (int i = 0; i < p; i++) {
            arr[sc.nextInt()-1] = true;
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            arr[sc.nextInt()-1] = true;;
        }

        boolean allClear = true;

        for (boolean val : arr) {
            if (!val) {
                allClear = false;
                break;
            }
        }

        System.out.println(allClear ? "I become the guy." : "Oh, my keyboard!");
        sc.close();
    }
}