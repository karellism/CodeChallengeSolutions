// Solution in Java to HackerRank 30 Days of Code, Day 8 Dictionaries and maps problem
// By Karel Vanhelden
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> nametophone = new HashMap<String, String>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String phone = sc.next();

            nametophone.put(name, phone);
        }

        while (sc.hasNext()) {
            String name = sc.next();

            if (nametophone.containsKey(name)) {
                System.out.println(name + "=" + nametophone.get(name));
            } else {
                System.out.println("Not found");
            }
        }

        sc.close();
    }
}
