package CodeForces;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        int output=0;
        Scanner sc = new Scanner(System.in);
        int candr=sc.nextInt();
        int matrix [][]=new int[candr][candr];
        int rc=candr-1;
        for (int i = 0; i < rc; i++) {
            for (int j = 0; j < rc; j++) {
                matrix[i][j]= sc.nextInt();
            }

        }

        int int1=0;
        int int2=0;
        for (int i = 0; i < rc; i++) {
            int1+=matrix[i][i];
            for (int j = rc; j > 0; j--) {
                int2+=matrix[i][j];
                break;
            }
        }


        output=int1-int2;
        System.out.println(Math.abs(output));
    }
}
