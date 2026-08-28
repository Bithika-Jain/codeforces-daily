import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;

        while (n-- > 0) {
            String str = sc.next();

            switch (str) {
                case "Tetrahedron" -> res += 4;
                case "Cube" -> res += 6;
                case "Octahedron" -> res += 8;
                case "Dodecahedron" -> res += 12;
                case "Icosahedron" -> res += 20;
            }
        }

        System.out.println(res);
        sc.close();
    }
}