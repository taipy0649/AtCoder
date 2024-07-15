import java.util.Scanner;

public class Main {
	public static void main(String[] args){

        // input
        Scanner sc = new Scanner(System.in);
        
        
        int height = sc.nextInt();
        int width = sc.nextInt();

        int[][] a = new int[height][width];
        int[][] Answer = new int[height][width];

        int[] row = new int[width];
        int[] column = new int[height];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // pre calculate
        for (int h = 0; h < height; h++) {
            
            for (int w = 0; w < width; w++) {
                row[w] += a[h][w];
                column[h] += a[h][w];
            }
        }

        // calculate

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Answer[i][j] = row[j] + column[i] - a[i][j];
            }
        }

        // output
        for (int i = 0; i < height; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < width; j++) {
                if (j != 0) {
                    sb.append(" ");
                }
                sb.append(Answer[i][j]);
            }
            System.out.println(sb.toString());
        }

	}
}