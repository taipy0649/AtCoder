// remove that "package contest.abc" when you submit this;
package contest.abc.A_PilingUp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int rate = sc.nextInt();

        if (rate < 100) {
            System.out.println(100 - rate);
        } else if (rate < 200) {
            System.out.println(200 - rate);
        } else if (rate < 300) {
            System.out.println(300 - rate);
        }
        
        sc.close();
    }
    
}
