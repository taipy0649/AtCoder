import java.util.Scanner;

public class Main {
	public static void main(String[] args){

        // input
        Scanner sc = new Scanner(System.in);
        
        int[][] a = new int[2000][2000];
        int[][] Answer = new int[2000][2000];

        int height = sc.nextInt();
        int width = sc.nextInt();

        int[] row = new int[2000];
        int[] column = new int[2000];

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
            for (int j = 0; j < width; j++) {
                if (j >= 1) System.out.print(" ");
                
                System.out.print(Answer[i][j]);
            }
            System.out.println();
        }

        sc.close();

	}
}