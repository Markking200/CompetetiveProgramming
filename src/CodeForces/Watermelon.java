package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Watermelon {

    public static void main(String[] args) throws IOException {
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(str);
        int w = Integer.parseInt(br.readLine());
        if (w % 2 == 0 && w > 0 && w != 2) {
            System.out.println("YES");

        } else {
            System.out.println("NO");

        }
    }
}
