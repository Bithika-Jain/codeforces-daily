import java.util.Scanner;

public class HitTheLottery {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] den = {100,20,10,5,1};
        int res = 0;

        for (int num : den) {  
            if ( n >= num) {
                res += n/num;
                n = n%num;
            }
        }

        System.out.println(res);
        sc.close();

    }
}