package contest.abc363.B_JapaneseCursedDoll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = sc.nextInt();
        int length = sc.nextInt();
        int endPeopeleNumber = sc.nextInt();


        // int[] l = new int[people];
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < people; i++) {
            l.add(sc.nextInt());
        }

        Collections.sort(l, Collections.reverseOrder());

        if (l.get(endPeopeleNumber - 1) >= length) {
            System.out.println(0);
        } else {
            int ans = length - l.get(endPeopeleNumber - 1);
            System.out.println(ans);
        }

        

        sc.close();

    }
}
