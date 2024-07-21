package contest.abc363.C_AvoidKPalindrome2;

// this is not correct

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int lengthOfpalindrome = sc.nextInt();
        String s = sc.next();

        char[] c = s.toCharArray();

        int top = 1;
        for (int i = 1; i <= length; i++) {
            top *= i;
        }

        int bottom = 1;

        Map<Character, Integer> map = new HashMap<>();

        for (char d : c) {
            map.put(d, map.getOrDefault(d, 0) + 1);
        }

        for (Integer val : map.values()) {
            for (int i = 1; i <= val ; i++) {
                bottom *= i; 
            }
        }

        int kumiawase = top / bottom;

        
        // System.out.println(ans);
        // System.out.println(top);

        sc.close();
    }
}
