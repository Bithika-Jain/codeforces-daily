import java.util.*;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> type1 = new ArrayList<>();
        ArrayList<Integer> type2 = new ArrayList<>();
        ArrayList<Integer> type3 = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int t = sc.nextInt();

            if (t == 1)
                type1.add(i);
            else if (t == 2)
                type2.add(i);
            else
                type3.add(i);
        }

        int teams = Math.min(type1.size(),
                     Math.min(type2.size(), type3.size()));

        StringBuilder out = new StringBuilder();
        out.append(teams).append('\n');

        for (int i = 0; i < teams; i++) {
            out.append(type1.get(i)).append(' ')
               .append(type2.get(i)).append(' ')
               .append(type3.get(i)).append('\n');
        }

        System.out.print(out);
        sc.close();
    }
}