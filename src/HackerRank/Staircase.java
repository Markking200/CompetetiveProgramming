package HackerRank;

import java.util.Scanner;
import java.lang.String;

public class Staircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        String str="#";

        for (int i = 0; i < rows; i++) {
            System.out.printf("%"+rows+"s\n",str);
            str+="#";
        }

    }
}
