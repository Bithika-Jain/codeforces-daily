import java.io.*;
import java.util.*;

public class RegistrationSystem {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String name = br.readLine();

            if (!map.containsKey(name)) {
                map.put(name, 1);
                output.append("OK\n");
            } else {
                int count = map.get(name);

                String newName = name + count;

                while (map.containsKey(newName)) {
                    count++;
                    newName = name + count;
                }

                map.put(name, count + 1);
                map.put(newName, 1);

                output.append(newName).append("\n");
            }
        }

        System.out.print(output);
    }
}